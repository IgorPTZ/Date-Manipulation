package manipulacao.de.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilizandoSimpleDateFormat {
	
	public static void main(String[] args) throws ParseException {
		
		/* Utilizando o SimpleDateFormat e Date para comparar datas */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		// Formata a data no formato estabelecido acima
		Date dataDeVencimentoDoBoleto = simpleDateFormat.parse("30/07/21");
		
		Date dataAtual = simpleDateFormat.parse("24/07/21");
		
		if(dataDeVencimentoDoBoleto.after(dataAtual)) {
			
			System.out.println("O boleto nao esta vencido");
		}
		else {
			
			System.out.println("O boleto esta vencido");
		}
		
		if(dataDeVencimentoDoBoleto.before(dataAtual)) {
			
			System.out.println("O boleto esta vencido");
		}
		else {
			
			System.out.println("O boleto nao esta vencido");
		}
	}
}
