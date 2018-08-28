package oop.poly1;

// 휴대폰 클래스(상위 클래스)
// - 변수 : 접근제한
// - 메소드 : 재정의의 강요/선택/거부
// - 생성자 : 
public class Phone {
	// private		-> 그 누구도 접근 불가(나만 사용)
	private String serial;
	
	// protected	-> 자식 클래스가 자유롭게 접근이 가능
	protected String number;
	
	// 필수기능 : 전원 기능(내용의 정의할 수 없다)
	
	// 선택기능 : 카메라 기능
	public void camera() {
		System.out.println("기본 카메라 기능");
	}
	
	// 수정불가 : 개발자 모드(절대로 변경되면 안되는 기능)  - final
	public final void develop() {
		System.out.println("개발자 모드");
	}

	public void power() {
		// TODO Auto-generated method stub
		
	}
}
