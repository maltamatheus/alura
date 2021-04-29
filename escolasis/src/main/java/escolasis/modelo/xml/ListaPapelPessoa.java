package escolasis.modelo.xml;

import java.util.List;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import escolasis.modelo.PapelPessoa;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaPapelPessoa {
	
	@XmlElement(name = "papel")
	List<PapelPessoa> papeis;
	
	public ListaPapelPessoa() {
		
	}
	
	public ListaPapelPessoa(List<PapelPessoa> lista) {
		this.papeis = lista;
	}
	
	public List<PapelPessoa> getPapeis() {
		return papeis;
	}
	
	public void setPapeis(List<PapelPessoa> papeis) {
		this.papeis = papeis;
	}

	@Override
	public String toString() {
		return "ListaPapelPessoa [papeis=" + papeis + "]";
	}
}
