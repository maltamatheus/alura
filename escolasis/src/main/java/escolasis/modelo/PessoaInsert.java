package escolasis.modelo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PessoaInsert implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@XmlElement(required = true)
	private String cpf;
	
	@XmlElement(required = true)
	private String nome;
	
	private String dtNascto;
	
	@XmlElement(required = true)
	private Long idPapelPessoa;
	
	public PessoaInsert(){
	}
	
	public PessoaInsert(String cpf, String nome, String dtNascto, Long idPapelPessoa) {
		this.cpf = cpf;
		this.nome = nome;
		this.dtNascto = dtNascto;
		this.idPapelPessoa = idPapelPessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(String dtNascto) {
		this.dtNascto = dtNascto;
	}
	
	public Long getIdPapelPessoa() {
		return idPapelPessoa;
	}
	
	public void setIdPapelPessoa(Long idPapelPessoa) {
		this.idPapelPessoa = idPapelPessoa;
	}
	
	public String toString() {
		return "CPF: " + this.cpf + " - NOME: " + this.nome.toUpperCase() + " - NASCIMENTO: " + this.dtNascto
		 + " - ID_PAPEL_PESSOA: " + this.idPapelPessoa ;
	}
	
}