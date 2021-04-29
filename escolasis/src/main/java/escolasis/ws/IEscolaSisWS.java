package escolasis.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import escolasis.modelo.dao.DaoFactory;
import escolasis.modelo.xml.ListaPapelPessoa;

@WebService(name="IEscolaSisWS")
@XmlSeeAlso({ObjectFactory.class})
public interface IEscolaSisWS {
	
	@WebResult(name = "papeis")
	@RequestWrapper(localName = "ObterTodosOsPapeisDePessoa"
	               ,className = "escolasis.ws.EscolaSisWS")
	@WebMethod(operationName = "ObterTodosOsPapeisDePessoa")
	@ResponseWrapper(localName = "papeisResposta"
	                ,className = "ListaPapelPessoa")
	public ListaPapelPessoa getListaPapelPessoa();

}
