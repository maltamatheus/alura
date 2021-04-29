package escolasis.modelo.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import escolasis.exceptions.AutenticacaoException;
import escolasis.modelo.Pessoa;
import escolasis.modelo.TokenUsuario;
import escolasis.modelo.dao.interfaces.PessoaDao;
import escolasis.modelo.xml.ListaPessoa;
import escolasis.utils.Utils;

public class JdbcPessoaDao implements PessoaDao {
	
	Connection conexao;
	
	public JdbcPessoaDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void salvar(Pessoa pessoa) {
		
		if (!cpfValido(pessoa.getCpf())) {
			throw new RuntimeException("CPF Inválido");
		}
		
		String sql = "insert into tab_pessoa values (?,?,?,?)";
		
		try {
			PreparedStatement insert = this.conexao.prepareStatement(sql);
			insert.setString(1, pessoa.getCpf());
			insert.setString(2, pessoa.getNome());
			insert.setDate(3, Utils.converteLocalDateToDate(pessoa.getDtNascto()));
			insert.setLong(4, pessoa.getIdPapelPessoa());
			insert.execute();
			this.conexao.commit();
		} catch (Exception e) {
			try {
				this.conexao.rollback();
			} catch (Exception e1) {
				throw new RuntimeException("Falha ao executar o rollback",e1);
			}
			throw new RuntimeException("Falha ao inserir na tabela tab_pessoa",e);
		}
	}

	@Override
	public List<Pessoa> listar() {
		String sql = "select * from tab_pessoa";
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		try {
			ResultSet consulta = this.conexao.createStatement().executeQuery(sql);
			while(consulta.next()) {
				Pessoa pessoa = new Pessoa(consulta.getString(1),consulta.getString(2),
						                   Utils.converteDateToLocalDate(consulta.getDate(3)),
						                   consulta.getLong(4));
				lista.add(pessoa);
			}
		} catch (Exception e) {
			throw new RuntimeException("Falha ao obter registros de Pessoa",e);
		}
		return lista;
	}

	@Override
	public ListaPessoa salvar(TokenUsuario token, ListaPessoa pessoas) throws AutenticacaoException, ParseException {
		
		System.out.println("Salvando a lista de pessoas");

		if (!Utils.tokenVerdadeiro(token)) {
			throw new AutenticacaoException("Falha na autenticação");
		}
		
		for (Pessoa pessoa : pessoas.getPessoas()) {
			salvar(pessoa);
		}

		return pessoas;
		
	}
	
	private boolean cpfValido(String cpf) {
		if (cpf.length() < 11) {
			return false;
		}
		
		return true;
	}
}
