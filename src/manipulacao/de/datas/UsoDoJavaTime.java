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
	}
}
