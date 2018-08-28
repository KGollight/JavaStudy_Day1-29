package oop.poly5;

public class Test01 {

	public static void main(String[] args) {
		// Player의 인스턴스를 만드는 방법
		// [1] 클래스를 만들어 상속받은 뒤 생성
		// [2] 익명중첩클래스를 이용(1회용 상속)
		
//		Player p = new Player("홍길동", "전사");
		Player p = new Player("홍길동", "전사") {
			// 필요한 메소드를 재정의
			@Override
			public void attack() {
				System.out.println("["+this.id+"] 공격합니다.");
			}
		};
		
		p.attack();
	}

}
