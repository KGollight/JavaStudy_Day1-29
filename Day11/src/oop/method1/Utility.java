package oop.method1;

// 메소드만 가지는 클래스
// -> 자주 사용하는코드 저장소
public class Utility {
	void test() {
		System.out.println("테스트!");
	}
	
	void test2() {
		System.out.println("테스트2!");
	}
	
	// 매개변수가 존재하는 메소드
	void test3(int a, int b) {
		System.out.println(a+b);
	}
	
	// void : 결과값이 없음
	// null : 대상이 없음
	// 덧셈을 수행하는 메소드
	int sum(int a, int b) {
		return a+b;
	}
}
