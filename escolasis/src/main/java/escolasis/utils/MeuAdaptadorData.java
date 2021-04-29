package escolasis.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class MeuAdaptadorData extends XmlAdapter<String, Date>{

	String padrao = "dd/MM/yyyy HH:mm:ss";
	
	@Override
	public String marshal(Date data) throws Exception {
		return new SimpleDateFormat(padrao).format(data);
	}

	@Override
	public Date unmarshal(String data) throws Exception {
		return new SimpleDateFormat(padrao).parse(data);
	}
	

}
