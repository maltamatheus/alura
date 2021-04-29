package escolasis.modelo.dao;

import escolasis.modelo.dao.interfaces.PapelPessoaDao;
import escolasis.modelo.dao.interfaces.PessoaDao;
import escolasis.modelo.dao.jdbc.JdbcDaoFactory;

/**
 * 
 * 
 * @author Matheus Malta
 * Classe abstrata para especificar as conexões com o banco de dados
 *
 */
public abstract class DaoFactory {
	
	/**
	 * @return
	 * Método para implementar a conexão com o banco de dados
	 * Retorna a conexão já estabelecida
	 */
	public static DaoFactory getDaoFactory() {
		return new JdbcDaoFactory();
	}
	
	public abstract PapelPessoaDao getPapelPessoaDao();
	
	public abstract PessoaDao getPessoaDao();

}
