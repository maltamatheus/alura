package escolasis.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import escolasis.modelo.TokenUsuario;

public class Utils {
	
	public static Date converteLocalDateTimeToDate(LocalDateTime data) {
		
		ZonedDateTime zdt = data.atZone(ZoneId.systemDefault());
		
		Instant instante = zdt.toInstant();
		
		return  Date.from(instante);
	}
	
	public static java.sql.Date converteLocalDateToDate(LocalDate dtNascto) {
		return new java.sql.Date(Date.from(dtNascto.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()).getTime());
	}
	
	public static LocalDateTime converteDateToLocalDateTime (java.sql.Date data) {
		return Instant.ofEpochMilli(data.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	public static LocalDate converteDateToLocalDate(java.sql.Date data) {
		return Instant.ofEpochMilli(data.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static Long getMaxId(Connection conexao, String nomeTabela) {
		
		String sql = "select max(id) from " + nomeTabela;
		Long maxId = null;
		try {
			
			ResultSet consulta = conexao.createStatement().executeQuery(sql);
			
			while(consulta.next()) {
				maxId = consulta.getLong(1);
			}

		} catch(NullPointerException npe){
			return 1L;
		} catch (Exception e) {
			throw new RuntimeException("Falha ao obter o último ID da tabela",e);
		}
		
		return maxId + 1;
		
	}

	public static boolean tokenVerdadeiro(TokenUsuario token) throws ParseException {
		if (token.getToken().contentEquals("aaa") && 
		   token.getDtValidade().compareTo(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2021"))<=0) {
			return true;
		} else {
			return false;
		}
	}

}
