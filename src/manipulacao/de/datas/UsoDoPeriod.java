package manipulacao.de.datas;

import java.time.LocalDate;
import java.time.Period;

public class UsoDoPeriod {
	
	public static void main(String args[]) {
		
		LocalDate dataAntiga = LocalDate.parse("1979-05-05");
		
		LocalDate dataNova = LocalDate.parse("2021-08-25");
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Numero de meses no periodo: " + periodo.toTotalMonths());
		
		System.out.println("Periodo entre as datas: " + periodo.getYears() + " anos, " + 
		                    periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
	}
}
