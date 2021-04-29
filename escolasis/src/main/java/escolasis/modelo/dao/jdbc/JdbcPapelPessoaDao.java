package escolasis.modelo.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import escolasis.modelo.PapelPessoa;
import escolasis.modelo.dao.interfaces.PapelPessoaDao;
import escolasis.utils.MeuAdaptadorData;
import escolasis.utils.Utils;

public class JdbcPapelPessoaDao implements PapelPessoaDao {

	Connection conexao;
	
	MeuAdaptadorData conv = new MeuAdaptadorData();
	
	public JdbcPapelPessoaDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void salvar(PapelPessoa papelPessoa) {
		
		String sqlInsert = "insert into tab_papel_pessoa values (?,?)";
		
		try {
			PreparedStatement insert = this.conexao.prepareStatement(sqlInsert);
			insert.setLong(1, Utils.getMaxId(this.conexao, "tab_papel_pessoa"));
			insert.setString(2,papelPessoa.getNomePapelPessoa());
			insert.execute();
			this.conexao.commit();
		} catch (Exception e) {
			try {
				this.conexao.rollback();
			} catch (SQLException e1) {
				throw new RuntimeException("Falha ao efetuar rollback - GRAVAR PAPEL PESSOA", e1);
			}
			throw new RuntimeException("Falha ao gravar em TAB_PAPEL_PESSOA", e);
		}

	}

	@Override
	public List<PapelPessoa> listar() {
		String sql = "select * from tab_papel_pessoa order by id";
		List<PapelPessoa> lista = new ArrayList<PapelPessoa>();
		
		try {
			ResultSet consulta = this.conexao.createStatement().executeQuery(sql);
			while(consulta.next()) {
				PapelPessoa papelPessoa = new PapelPessoa(consulta.getLong(1), consulta.getString(2));
//				papelPessoa.setDtInsert(Utils.converteDateToLocalDateTime(consulta.getDate(3)));
//				papelPessoa.setDtUpdate(Utils.converteDateToLocalDateTime(consulta.getDate(4)));
				 papelPessoa.setDtIns(conv.marshal(consulta.getDate(3)));
				 papelPessoa.setDtUpd(conv.marshal(consulta.getDate(4)));
				lista.add(papelPessoa);
			}
		} catch (Exception e) {
			throw new RuntimeException("Falha ao obter registros de Papel de Pessoa",e);
		}
		
		return lista;
	}

	@Override
	public PapelPessoa getPapelPessoa(Long idPapelPessoa) {
		
		String sql  = "select * from tab_papel_pessoa where id = " + idPapelPessoa;
		
		PapelPessoa papelPessoa = new PapelPessoa();
		
		try {
			ResultSet consulta = this.conexao.createStatement().executeQuery(sql);
			while(consulta.next()) {
				
				 papelPessoa.setIdPapelPessoa(consulta.getLong(1));
				 papelPessoa.setNomePapelPessoa(consulta.getString(2));
//				 papelPessoa.setDtInsert(Utils.converteDateToLocalDateTime(consulta.getDate(3)));
//				 papelPessoa.setDtUpdate(Utils.converteDateToLocalDateTime(consulta.getDate(4)));
				 papelPessoa.setDtIns(conv.marshal(consulta.getDate(3)));
				 papelPessoa.setDtUpd(conv.marshal(consulta.getDate(4)));
				
			}
		} catch (Exception e) {
			throw new RuntimeException("Falha ao obter Papel Pessoa do ID = " + idPapelPessoa, e);
		}
		return papelPessoa;
	}
	
	

}
