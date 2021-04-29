package escolasis.modelo;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import escolasis.utils.MeuAdaptadorData;

@XmlAccessorType(XmlAccessType.FIELD)
public class TokenUsuario {
	
	@XmlElement(required = true)
	String token;
	
	@XmlJavaTypeAdapter(MeuAdaptadorData.class)
	@XmlElement(required = true)
	Date dtValidade;
	
	public TokenUsuario() {
		
	}
	
	public TokenUsuario(String token, Date dtValidade) {
		this.token = token;
		this.dtValidade = dtValidade;
	}
	
	public Date getDtValidade() {
		return dtValidade;
	}
	
	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}

}
