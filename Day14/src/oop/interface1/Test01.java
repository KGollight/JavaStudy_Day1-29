package oop.interface1;

public class Test01 {

	public static void main(String[] args) {
		// Func를 인스턴스화 할 수 있는가?
		// - 안되는 것이 원칙이지만 익명중첩클래스는 가능하다
		
		Func a = new Func() {
			public void hello() {
				System.out.println("반갑네!");
			}
		};
		a.hello();
		
		// 함수형 인터페이스만 특별히 축약식을 사용
		Func b = /*new Func() {*/
				/*public void hello()*/() -> {
				System.out.println("반갑네!");
			}
		/*};*/;
		b.hello();
		
		// 이러한 축약식 형태를 람다(lambda)라고 부른다.
		// - 람다를 주로 쓰는 형태를 함수형 프로그래밍이라 부른다.
		Func c = () -> {
			System.out.println("안녕하신가!");
		};
	}

}
