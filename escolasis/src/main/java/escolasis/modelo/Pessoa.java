package escolasis.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import escolasis.utils.Utils;

public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cpf;
	private String nome;
	private LocalDate dtNascto;
	private Long idPapelPessoa;
	
	public Pessoa(){
	}
	
	public Pessoa(String cpf, String nome, LocalDate dtNascto, Long idPapelPessoa) {
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

	public LocalDate getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(LocalDate dtNascto) {
		this.dtNascto = dtNascto;
	}
	
	public Long getIdPapelPessoa() {
		return idPapelPessoa;
	}
	
	public void setIdPapelPessoa(Long idPapelPessoa) {
		this.idPapelPessoa = idPapelPessoa;
	}
	
	public String toString() {
		return "CPF: " + this.cpf + " - NOME: " + this.nome.toUpperCase() + " - NASCIMENTO: " + exibirDataNascto(this.dtNascto)
		 + " - ID_PAPEL_PESSOA: " + this.idPapelPessoa ;
	}

	private String exibirDataNascto(LocalDate dtNascto) {
		return new SimpleDateFormat("dd/MM/yyyy").format(Utils.converteLocalDateToDate(dtNascto));
	}
}