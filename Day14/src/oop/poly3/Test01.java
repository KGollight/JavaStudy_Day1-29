package oop.poly3;

public class Test01 {
	public static void main(String[] args) {
		Phone a = new GalaxyS9();
		Phone b = new IphoneX();
		
		a.call();
		b.call();
		
//		a.vixbee();	// 고유 기능은 사용 불가
	}
}
