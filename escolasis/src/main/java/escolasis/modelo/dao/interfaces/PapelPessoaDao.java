package escolasis.modelo.dao.interfaces;

import java.util.List;

import escolasis.modelo.PapelPessoa;

public interface PapelPessoaDao {
	
	public void salvar(PapelPessoa papelPessoa);

	public List<PapelPessoa> listar();

	public PapelPessoa getPapelPessoa(Long idPapelPessoa);

}
