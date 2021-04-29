package escolasis.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import escolasis.utils.Utils;

@XmlType(propOrder = {"idPapelPessoa","nomePapelPessoa","dtIns","dtUpd"})
public class PapelPessoa {
	
	private Long idPapelPessoa;
	private String nomePapelPessoa;
//	private LocalDateTime dtInsert;
//	private LocalDateTime dtUpdate;
	private String dtIns;
	private String dtUpd;
	
	public PapelPessoa() {
		
	}

	public PapelPessoa(Long idPapelPessoa, String nomePapelPessoa) {
		this.idPapelPessoa = idPapelPessoa;
		this.nomePapelPessoa = nomePapelPessoa;
	}
	
//	public PapelPessoa(Long idPapelPessoa, String nomePapelPessoa, LocalDateTime dtInsert, LocalDateTime dtUpdate) {
//		this.idPapelPessoa = idPapelPessoa;
//		this.nomePapelPessoa = nomePapelPessoa;
//		this.dtInsert = dtInsert;
//		this.dtUpdate = dtUpdate;
//	}
	
	public PapelPessoa(Long idPapelPessoa, String nomePapelPessoa, String dtIns, String dtUpd) {
		this.idPapelPessoa = idPapelPessoa;
		this.nomePapelPessoa = nomePapelPessoa;
		this.dtIns = dtIns;
		this.dtUpd = dtUpd;
	}

	public Long getIdPapelPessoa() {
		return idPapelPessoa;
	}

	public void setIdPapelPessoa(Long idPapelPessoa) {
		this.idPapelPessoa = idPapelPessoa;
	}

	public String getNomePapelPessoa() {
		return nomePapelPessoa;
	}

	public void setNomePapelPessoa(String nomePapelPessoa) {
		this.nomePapelPessoa = nomePapelPessoa;
	}

//	public LocalDateTime getDtInsert() {
//		return dtInsert;
//	}
//	
//	public void setDtInsert(LocalDateTime dtInsert) {
//		this.dtInsert = dtInsert;
//	}
//
//	public LocalDateTime getDtUpdate() {
//		return dtUpdate;
//	}
//	
//	public void setDtUpdate(LocalDateTime dtUpdate) {
//		this.dtUpdate = dtUpdate;
//	}
	
	public String getDtIns() {
		return dtIns;
	}
	
	public void setDtIns(String dtIns) {
		this.dtIns = dtIns;
	}
	
	public String getDtUpd() {
		return dtUpd;
	}
	
	public void setDtUpd(String dtUpd) {
		this.dtUpd = dtUpd;
	}

//	@Override
//	public String toString() {
//		return "PapelPessoa [idPapelPessoa=" + idPapelPessoa + ", nomePapelPessoa=" + nomePapelPessoa + ", dtInsert="
//				+ formataDatas(Utils.converteLocalDateTimeToDate(this.dtInsert)) + ", " 
//				+ "dtUpdate=" + formataDatas(Utils.converteLocalDateTimeToDate(this.dtUpdate)) + "]";
//	}
	
	@Override
	public String toString() {
		return "[idPapelPessoa = " + this.idPapelPessoa + ", nomPapelPessoa = " + this.nomePapelPessoa + 
		                    "dtIns = " + this.dtIns + "dtUpd = " + this.dtUpd + "]";
	}
	
	private String formataDatas(Date date) {
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
	}
}
