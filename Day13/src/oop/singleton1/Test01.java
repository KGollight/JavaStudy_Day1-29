package oop.singleton1;

public class Test01 {

	public static void main(String[] args) {
		// 현재의 Timer는 생성 개수에 제한이 없다(프로토타입, prototype)
		Timer a = new Timer(1, 50, 30);
		Timer b = new Timer(1, 20, 25);
	}

}
