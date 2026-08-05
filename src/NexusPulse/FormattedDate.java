package NexusPulse;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class FormattedDate {
	
	public static void main(String args[]) {

		getFutureDate(0,"dd/MMMM/yyyy");
		
		getFutureDate(15,"d/MMMM/yyyy");

	}
	public static String getFutureDate(int n,String format)
	{

		//Identifying the future date from the current date

		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DAY_OF_MONTH, n);

		Date d = cal.getTime();
 	
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		String formattedDate = sdf.format(d);
		
		System.out.println("Formatted Date::" + formattedDate);
		return formattedDate;
		
//		LocalDate date = LocalDate.now().plusDays(n);
//	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
//	    System.out.println(date.format(dtf));
//	    return date.format(dtf);
	   
		
	}


}
