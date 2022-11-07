package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		/*JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, date.getTime()); //data atual em milisegundos
		JOptionPane.showMessageDialog(null, date.getHours()); //se usa mais o calendar() agora*/
	
		/*------------------------------- Simple Date Format -------------------------------*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS"); /*salvar no DB*/
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); /*mostrar na tela*/
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data atual no formato padr�o: " + simpleDateFormat2.format(date));
		System.out.println("Data atual no formato para 'Banco de Dados': " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat3.parse("1987-10-18 14:08.37"));
		
	}

}
