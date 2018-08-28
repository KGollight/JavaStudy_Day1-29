package oop.inherit4;

// 자식(하위) 클래스
public class Child extends Parent {
	int a=20;
	
	public Child() {
		// 부모 생성자 호출 코드(첫번째줄 작성)
		super();
		System.out.println("child");
	}
}
