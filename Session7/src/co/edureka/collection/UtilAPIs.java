package co.edureka.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilAPIs {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 3);
		
		Date newDate = calendar.getTime();
		
		System.out.println("3 Months from now is: "+newDate);
		
		//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy | hh:mm:ss");
		String formattedDate = format.format(date);
		System.out.println("Today is: "+formattedDate);
		

	}

}
