package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test03 {

	public static void main(String[] args) {
//		날짜의 언어 설정
//		Locale.setDefault(Locale.ENGLISH);
		Locale.setDefault(Locale.CHINA);
		Date d = new Date();

		Format f = new SimpleDateFormat("y-MM-dd E aa h:mm:ss");
		System.out.println(f.format(d));
	}

}
