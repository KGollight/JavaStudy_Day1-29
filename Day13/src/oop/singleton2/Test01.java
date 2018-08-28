package oop.singleton2;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		// 현재의 Timer는 생성 개수에 제한이 없다(프로토타입, prototype)
//		Timer a = new Timer(1, 50, 30);
//		Timer b = new Timer(1, 20, 25);
		
		// 생성이 아니라 리모컨 복사
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
