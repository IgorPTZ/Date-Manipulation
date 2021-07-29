package manipulacao.de.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsoDoJavaTime {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("Data hora atual: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		System.out.println();
		
		LocalDate dataNova = LocalDate.parse("2021-07-19");
		
		System.out.println("Data nova: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.plusDays(5);
		
		System.out.println("Data nova com mais 5 dias: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));	
		
		dataNova = dataNova.plusWeeks(5);
		
		System.out.println("Data nova com mais 5 semanas: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.plusMonths(5);
		
		System.out.println("Data nova com mais 5 meses: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.plusYears(5);
		
		System.out.println("Data nova com mais 5 anos: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); 
	
		System.out.println();
		
		System.out.println("Data nova: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.minusDays(5);
		
		System.out.println("Data nova com menos 5 dias: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.minusWeeks(5);
		
		System.out.println("Data nova com menos 5 semanas: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.minusMonths(5);
		
		System.out.println("Data nova com menos 5 meses: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		dataNova = dataNova.minusYears(5);
		
		System.out.println("Data nova com menos 5 anos: " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		
		// Simulando criação de parcelas
		for(int parcela = 1; parcela <= 12; parcela++) {
			
			dataNova = dataNova.plusMonths(1);
			
			System.out.println("Parcela nº " + parcela + " com vencimento em " + dataNova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	} 
}
