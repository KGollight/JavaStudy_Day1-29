package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
//		Date를 이용해 시간을 읽어오기
		Date a = new Date();
		System.out.println("a = "+a);
		
//		Date b = new Date(2018, 8, 3);
		Date b = new Date(118, 7, 3);
		System.out.println("b = "+b);
		
//		a의 형식을 변경 - SimpleDateFormat필요(java.text)
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		Format f = new SimpleDateFormat("yyyy/MM/dd hh시 mm분");
		
		System.out.println("a = "+f.format(a));
	}

}
