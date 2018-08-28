package oop.modifier6;

public class Combat {
	// p1이 p2를 공격하는 기능
	// - p1은 타격을 실행
	// - p2는 피격을 실행
	public static void attack(Player p1, Player p2) {
		p1.attack();
		
		if(p1.isLive() && p1.getTarget()==p2)
			p2.defence(p1);
	}
}
