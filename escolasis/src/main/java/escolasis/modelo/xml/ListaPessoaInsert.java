package escolasis.modelo.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import escolasis.modelo.PessoaInsert;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaPessoaInsert {
	
	@XmlElement(name = "pessoa")
	List<PessoaInsert> pessoas;
	
	public ListaPessoaInsert() {
		
	}
	
	public ListaPessoaInsert(List<PessoaInsert> lista) {
		this.pessoas = lista;
	}
	
	public List<PessoaInsert> getPessoas() {
		return pessoas;
	}
	
	public void setPessoas(List<PessoaInsert> pessoas) {
		this.pessoas = pessoas;
	}

}
