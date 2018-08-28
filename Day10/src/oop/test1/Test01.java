package oop.test1;

public class Test01 {

	public static void main(String[] args) {
		// Message 생성
		// 인스턴스 생성
		Message a = new Message();
		
		// Message			자료형
		// a				레퍼런스(리모컨)
		// new Message()	인스턴스 생성
		
		// 데이터 초기화
		a.name = "누구게";
		a.text = "석양이 진다...";
		a.time = "오전 12:00";
		a.number = 1;
		
		System.out.println(a);
		System.out.println(a.name);
		System.out.println(a.text);
		System.out.println(a.time);
		System.out.println(a.number);
	}

}
