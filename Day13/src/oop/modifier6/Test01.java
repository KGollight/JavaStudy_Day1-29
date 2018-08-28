package oop.modifier6;

public class Test01 {

	public static void main(String[] args) {
		Player a = new Player("����", 30, 500);
		Player b = new Player("����", 50, 200);
		Player c = new Player("������", 20, 600);
		
		// ��� ����
		a.setTarget(c);
		c.setTarget(b);
		b.setTarget(a);
		
		// ����
		Combat.attack(a, c); // ���� -> ������
		Combat.attack(c, b); // ������ -> ����
		Combat.attack(b, a); // ���� -> ����
		
		a.print();
		b.print();
		c.print();
	}

}
