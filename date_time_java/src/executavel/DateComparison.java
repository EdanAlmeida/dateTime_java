package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparison {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/12/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("15/12/2022");

		if (dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não vencido! ");
		}else {
			System.out.println("Boleto vencido - URGENTE!");
		}
		
	}

}
