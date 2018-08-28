package api.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\t\t***������ ���� �Է��ϼ���***");
		int year = s.nextInt();
		int month = s.nextInt();
		
		s.close();
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, month-1, 1);
		
//		������ �̿��Ͽ� ���� ó��
		int week = c.get(Calendar.DAY_OF_WEEK);
		c.set(Calendar.DATE, c.get(Calendar.DATE)-(week-1));

		//42���� ��¥�� ���
		System.out.println("\t\t<"+year+"�� "+month+"�� �޷�"+">");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
