package escolasis.modelo.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import escolasis.modelo.dao.DaoFactory;
import escolasis.modelo.dao.interfaces.PapelPessoaDao;
import escolasis.modelo.dao.interfaces.PessoaDao;

public class JdbcDaoFactory extends DaoFactory {
	
	Connection conexao;
	
	public JdbcDaoFactory() {
		try {
			Class.forName("org.postgresql.Driver");
			this.conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/minhaescola", "postgres", "m1neirao");
			this.conexao.setAutoCommit(false);
		} catch (Exception e) {
			throw new RuntimeException("Falha ao conectar ao banco de dados", e);
		}
	}

	@Override
	public PapelPessoaDao getPapelPessoaDao() {
		return new JdbcPapelPessoaDao(this.conexao);
	}

	@Override
	public PessoaDao getPessoaDao() {
		return new JdbcPessoaDao(this.conexao);
	}

}
