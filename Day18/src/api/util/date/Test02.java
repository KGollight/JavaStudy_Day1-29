package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		Date d = new Date();
		
//		[1] 2018년 8월 3일
		Format f1 = new SimpleDateFormat("[1] : y년 M월 d일");
		System.out.println(f1.format(d));
		
//		[2] 2018-08-03
		Format f2 = new SimpleDateFormat("[2] : y-MM-dd");
		System.out.println(f2.format(d));
		
		
//		[3] 오후 1:29
		Format f3 = new SimpleDateFormat("[3] : a h:mm");
		System.out.println(f3.format(d));
		
		
//		[4] 13:29 (24시간 방식)
		Format f4 = new SimpleDateFormat("[4] : HH:mm:ss");
		System.out.println(f4.format(d));
		
		
//		[5] 2018-08-03 금 오전 10
		Format f5 = new SimpleDateFormat("[5] : y-MM-dd E aa h:mm:ss");
		System.out.println(f5.format(d));
		
	}

}
