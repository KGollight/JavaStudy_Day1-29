package oop.modifier6;

public class Test01 {

	public static void main(String[] args) {
		Player a = new Player("수지", 30, 500);
		Player b = new Player("설현", 50, 200);
		Player c = new Player("아이유", 20, 600);
		
		// 대상 설정
		a.setTarget(c);
		c.setTarget(b);
		b.setTarget(a);
		
		// 공격
		Combat.attack(a, c); // 수지 -> 아이유
		Combat.attack(c, b); // 아이유 -> 설현
		Combat.attack(b, a); // 설현 -> 수지
		
		a.print();
		b.print();
		c.print();
	}

}
