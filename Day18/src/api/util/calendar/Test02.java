package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2018, 11, 25);
		
		Date d = c.getTime();
		Format f = new SimpleDateFormat("y-MM-dd E");
		System.out.println(f.format(d));
		
		c.set(Calendar.DATE, c.get(Calendar.DATE)-99);
		d = c.getTime();
		System.out.println(f.format(d));
	}

}
