package escolasis.teste;

import javax.xml.ws.Endpoint;

import escolasis.ws.EscolaSisWS;

public class PublicaEscolaSisWS {
	
	public static void main(String[] args) {
		EscolaSisWS ws = new EscolaSisWS();
		String urlServico = "http://localhost:8080/escolasisws";
		System.out.println("Rodando o serviço " + urlServico + "?wsdl");
		Endpoint.publish(urlServico, ws);
	}

}
