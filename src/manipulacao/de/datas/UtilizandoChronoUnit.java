package manipulacao.de.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class UtilizandoChronoUnit {
	
	public static void main(String[] args) {
		 
		// Retorna o numero de minutos passados desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeMinutos = ChronoUnit.MINUTES.between(LocalDateTime.of(1979, 6, 21, 0, 0, 0), LocalDateTime.now());
		
		System.out.println("Numero de minutos passados entre " + 
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now() + ": " + numeroDeMinutos);
		
		// Retorna o numero de horas passadas desde a primeira data ate a segunda (Geralmente a data atual)
		
		Long numeroDeHoras = ChronoUnit.HOURS.between(LocalDateTime.of(1979, 6, 21, 0, 0, 0), LocalDateTime.now());
		
		System.out.println("Numero de horas passados entre " +
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now() + ": " + numeroDeHoras);  
		
		
		// Retorna o numero de dias passados desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeDias = ChronoUnit.DAYS.between(LocalDate.parse("1979-06-21"), LocalDate.now());
		
		
		
		System.out.println("Numero de dias passados entre " + 
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now().toString() + ": " + numeroDeDias);
		
		
		// Retorna o numero de semanas passadas desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeSemanas = ChronoUnit.WEEKS.between(LocalDate.parse("1979-06-21"), LocalDate.now());
		
		System.out.println("Numero de semanas passadas entre " +
		                   LocalDate.parse("1979-06-21").toString() + " e " +
						   LocalDate.now().toString() + ": " + numeroDeSemanas);
		
		
		// Retorna o numero de meses passados desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeMeses = ChronoUnit.MONTHS.between(LocalDate.parse("1979-06-21"), LocalDate.now());
		
		System.out.println("Numero de meses passados entre " +
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now().toString() + ": " + numeroDeMeses); 
		
		
		// Retorna o numero de anos passados desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeAnos = ChronoUnit.YEARS.between(LocalDate.parse("1979-06-21"), LocalDate.now());
		
		System.out.println("Numero de anos passados entre " +
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now().toString() + ": " + numeroDeAnos);
		
		
		// Retorna o numero de decadas passadas desde a primeira data ate a segunda (Geralmente a data atual)
		Long numeroDeDecadas = ChronoUnit.DECADES.between(LocalDate.parse("1979-06-21"), LocalDate.now());
		
		System.out.println("Numero de decadas passadas entre " +
		                   LocalDate.parse("1979-06-21").toString() + " e " +
				           LocalDate.now().toString() + ": " + numeroDeDecadas);
	}
}
