package manipulacao.de.datas;

import java.time.Duration;
import java.time.Instant;

public class UsoDoInstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant instantInicial = Instant.now();
		
		//Simulando uma rotina qualquer com um tempo de duração desconhecido 
		Thread.sleep(2000); 
		
		Instant instantFinal = Instant.now();
		
		// Calcula o tempo que a rotina acima levou para executar
		Duration duracao = Duration.between(instantInicial, instantFinal);
		
		System.out.println("Duração em nanosegundos: " + duracao.toNanos());
		
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		
		System.out.println("Duração em segundos:" + duracao.toSeconds());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duracao em horas: " + duracao.toHours());
		
		System.out.println("Duração em dias: " + duracao.toDays());
	}
}
