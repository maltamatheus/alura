package escolasis.exceptions.fault;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private Date dataErro;
	private String msg;
	
	public InfoFault(String msg, Date dataErro) {
		this.msg = msg;
		this.dataErro = dataErro;
	}
	
	public InfoFault() {
		
	}
	
	

}
