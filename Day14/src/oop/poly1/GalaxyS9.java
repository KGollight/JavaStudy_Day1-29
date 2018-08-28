package oop.poly1;

public class GalaxyS9 extends Phone{
//	변수(2)		: 접근불가(1), 접근가능(1)
//	메소드(3)	: 재정의강요(1), 재정의선택(1), 재정의불가(1)
	
//	전원 기능
	public void power() {
		System.out.println("삼성 로고가 표시됩니다");
	}
	
//	카메라 기능 재정의
	public void camera() {
		System.out.println("광각 카메라 기능 사용!");
	}
	
//	개발자 기능 재정의
//	public void develop() {
//		
//	}
		
}
