package escolasis.ws;

import javax.jws.WebService;

import escolasis.modelo.dao.DaoFactory;
import escolasis.modelo.xml.ListaPapelPessoa;

@WebService(endpointInterface = "escolasis.ws.IEscolaSisWS")
public class IEscolaSisWSImpl implements IEscolaSisWS {

	@Override
	public ListaPapelPessoa getListaPapelPessoa() {
		System.out.println("Chamando através do servidor");
		return new ListaPapelPessoa(DaoFactory.getDaoFactory().getPapelPessoaDao().listar());
	}

}
