package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();/*pega a data atual*/
		
		/*Se a data viesse do banco de dados*/
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); /*definindo uma data*/
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

	}

}
