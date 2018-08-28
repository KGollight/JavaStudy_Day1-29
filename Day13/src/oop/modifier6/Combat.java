package oop.modifier6;

public class Combat {
	// p1�� p2�� �����ϴ� ���
	// - p1�� Ÿ���� ����
	// - p2�� �ǰ��� ����
	public static void attack(Player p1, Player p2) {
		p1.attack();
		
		if(p1.isLive() && p1.getTarget()==p2)
			p2.defence(p1);
	}
}
