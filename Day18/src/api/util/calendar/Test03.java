package api.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\t\t***연도와 월을 입력하세요***");
		int year = s.nextInt();
		int month = s.nextInt();
		
		s.close();
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, month-1, 1);
		
//		요일을 이용하여 보정 처리
		int week = c.get(Calendar.DAY_OF_WEEK);
		c.set(Calendar.DATE, c.get(Calendar.DATE)-(week-1));

		//42개의 날짜를 출력
		System.out.println("\t\t<"+year+"년 "+month+"월 달력"+">");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int count=0;
		for(int i=0; i<42; i++) {
			int date = c.get(Calendar.DATE);
			System.out.print(date+"\t");
			c.set(Calendar.DATE, date+1);
			count++;
			if(count%7==0)
				System.out.println("\n");
		}
	}

}
