package escolasis.ws;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.ResponseWrapper;

import escolasis.exceptions.AutenticacaoException;
import escolasis.modelo.PapelPessoa;
import escolasis.modelo.Pessoa;
import escolasis.modelo.PessoaInsert;
import escolasis.modelo.TokenUsuario;
import escolasis.modelo.dao.DaoFactory;
import escolasis.modelo.xml.ListaPapelPessoa;
import escolasis.modelo.xml.ListaPessoa;
import escolasis.modelo.xml.ListaPessoaInsert;

@WebService
@SOAPBinding(style = Style.DOCUMENT,parameterStyle = ParameterStyle.WRAPPED) 
public class EscolaSisWS {
	
	@WebMethod(operationName = "ObterTodosOsPapeisDePessoa")
	@WebResult(name = "papeis")
//	@ResponseWrapper(localName = "papeis")
//	public List<PapelPessoa> getPapeisPessoa(){
	public ListaPapelPessoa getListaPapelPessoa() {
//		return DaoFactory.getDaoFactory().getPapelPessoaDao().listar();
		return new ListaPapelPessoa(DaoFactory.getDaoFactory().getPapelPessoaDao().listar());
	}
	
	@WebMethod(operationName = "ObterPapelDePessoaPorId")
	@WebResult(name = "papel")
	public PapelPessoa getPapelPessoa(@WebParam(name = "idPapelPessoa") Long idPapelPessoa) {
		return DaoFactory.getDaoFactory().getPapelPessoaDao().getPapelPessoa(idPapelPessoa);
	}
	
	@WebMethod(operationName = "ObterPessoas")
	@WebResult(name="pessoas")
	public ListaPessoa getPessoas() {
		return new ListaPessoa(DaoFactory.getDaoFactory().getPessoaDao().listar());
	}
	
	@WebMethod(operationName = "CadastrarListaPessoas")
	@WebResult(name = "pessoas")
	public ListaPessoaInsert salvar(@WebParam(name = "tokenUsuario",header = true) TokenUsuario token,
			                  @WebParam(name="listaPessoas") ListaPessoaInsert pessoas) throws AutenticacaoException, ParseException{

		List<Pessoa> lista = new ArrayList<Pessoa>();
		ListaPessoa listaPessoa = new ListaPessoa(lista);
		
		for (PessoaInsert pessoaInsert : pessoas.getPessoas()) {
			
			int ano = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[0]);
			int mes = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[1]);
			int dia = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[2]);

			Pessoa pessoa = new Pessoa(pessoaInsert.getCpf(),pessoaInsert.getNome(),
					                   LocalDate.of(ano, mes,dia),
					                   pessoaInsert.getIdPapelPessoa());
			listaPessoa.getPessoas().add(pessoa);
		}
		
		DaoFactory.getDaoFactory().getPessoaDao().salvar(token, listaPessoa);
		
		return pessoas;
	}
	
	@WebMethod(operationName = "ImprimirPessoas",action = "ImprimirMatheus")
	@Oneway
	@WebResult(name = "pessoas")
	public void imprimir(@WebParam(name="listaPessoas") ListaPessoaInsert pessoas) {

		List<Pessoa> lista = new ArrayList<Pessoa>();
		ListaPessoa listaPessoa = new ListaPessoa(lista);
		
		for (PessoaInsert pessoaInsert : pessoas.getPessoas()) {
			
			int ano = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[0]);
			int mes = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[1]);
			int dia = Integer.parseInt(pessoaInsert.getDtNascto().split("-")[2]);

			Pessoa pessoa = new Pessoa(pessoaInsert.getCpf(),pessoaInsert.getNome(),
					                   LocalDate.of(ano, mes,dia),
					                   pessoaInsert.getIdPapelPessoa());
			listaPessoa.getPessoas().add(pessoa);
		}
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}
}
