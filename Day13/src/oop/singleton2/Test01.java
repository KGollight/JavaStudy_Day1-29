package oop.singleton2;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		// ������ Timer�� ���� ������ ������ ����(������Ÿ��, prototype)
//		Timer a = new Timer(1, 50, 30);
//		Timer b = new Timer(1, 20, 25);
		
		// ������ �ƴ϶� ������ ����
		// Timer a = Timer.timer;
		Timer a = Timer.getInstance();
		Timer b = Timer.getInstance();
		
		a.setHour(5);
		a.setMinute(10);
		a.setSecond(30);
		
		System.out.println(b.getHour());
		System.out.println(b.getMinute());
		System.out.println(b.getSecond());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
