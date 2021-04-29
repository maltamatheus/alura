package escolasis.exceptions;

import java.util.Date;

import javax.xml.ws.WebFault;

import escolasis.exceptions.fault.InfoFault;

@WebFault(name = "AutenticacaoFault")
public class AutenticacaoException extends Exception {
	
	public AutenticacaoException(String msg) {
		super(msg);
	}
	
	public InfoFault getFaultInfo() {
//		return "Token inv�lido";
		return new InfoFault("Token Inv�lido", new Date());
	}
	
}
