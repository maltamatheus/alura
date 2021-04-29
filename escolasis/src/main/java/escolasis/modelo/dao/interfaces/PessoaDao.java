package escolasis.modelo.dao.interfaces;

import java.text.ParseException;
import java.util.List;

import escolasis.exceptions.AutenticacaoException;
import escolasis.modelo.Pessoa;
import escolasis.modelo.TokenUsuario;
import escolasis.modelo.xml.ListaPessoa;

public interface PessoaDao {
	
	public void salvar(Pessoa pessoa);
	
	public List<Pessoa> listar();

	ListaPessoa salvar(TokenUsuario token, ListaPessoa pessoas) throws AutenticacaoException, ParseException;

}
