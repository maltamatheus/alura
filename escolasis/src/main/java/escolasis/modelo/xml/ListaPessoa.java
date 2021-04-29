package escolasis.modelo.xml;

import java.util.List;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import escolasis.modelo.Pessoa;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaPessoa {
	
	@XmlElement(name = "pessoa")
	List<Pessoa> pessoas;
	
	public ListaPessoa() {
		
	}
	
	public ListaPessoa(List<Pessoa> lista) {
		this.pessoas = lista;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
