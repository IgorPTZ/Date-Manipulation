package manipulacao.de.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UtilizandoCalendar {
	
	public static void main(String[] args) throws ParseException  {
		
		// Obter data atual
		Calendar calendar = Calendar.getInstance();
		
		// Simula data que vem do banco de dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("24-07-2021"));
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Adicionar dias a data
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Remove dias da data
		calendar.add(Calendar.DAY_OF_MONTH, -5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Adiciona meses a data
		calendar.add(Calendar.MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Remove meses da data
		calendar.add(Calendar.MONTH, -5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Adiciona anos a data
		calendar.add(Calendar.YEAR, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		// Remove anos da data
		calendar.add(Calendar.YEAR, -5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
