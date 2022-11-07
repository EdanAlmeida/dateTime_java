package executavel;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarJava {

	public static void main(String[] args) {
		
		/*Forma mais atual do Java*/
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do mês: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Dia do mês: " + calendar.get(Calendar.YEAR));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Calendar data autla: " + simpleDateFormat.format(calendar.getTime()));

		
		
	}

}
