package oop.inner4;

public class Test01 {

	public static void main(String[] args) {
		Airplane a = new Airplane() {
			// 익명 클래스 영역
			// - 재정의 또는추가를 구현할 수 있다
			
			// 메소드 재정의(override)
			public void attack() {
				System.out.println("유도탄 발사!");
			}
			
			public void bomb() {
				System.out.println("융단폭격!");
			}
		};
		
		Airplane b = new Airplane() {
			public void attack() {
				System.out.println("집중광선!");
			}
			
			public void bomb() {
				System.out.println("아군 지원!");
			}
		};
		
		a.attack();
		a.bomb();
		a.move();
		
		b.attack();
		b.bomb();
		b.move();
	}

}
