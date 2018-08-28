package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
//		Calendar
//		 - 시간의 일관성을 위해 직접 생성 불가(추상 클래스)
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		시간 설정	c.seet(항목, 값)
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 10);
		
//		[1] 직접 데이터를 꺼내어출력	c.get(int);
		System.out.println(c.get(Calendar.YEAR));//연도
		System.out.println(c.get(Calendar.MONTH)+1);//월(0~11)
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//일
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//시
		System.out.println(c.get(Calendar.MINUTE));//분
		System.out.println(c.get(Calendar.SECOND));//초
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//요일
		
//		[2] Date로 변환하여 출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("y-MM-dd E a hh:mm:ss");
		System.out.println(f.format(d));
	}

}
