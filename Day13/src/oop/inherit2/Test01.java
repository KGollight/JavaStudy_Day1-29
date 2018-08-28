package oop.inherit2;

public class Test01 {

	public static void main(String[] args) {
		Worrior a = new Worrior();
		a.setId("전사");
		a.setAttack(30);
		a.setHp(500);
		a.bash();
		a.print();
		
		Magician b = new Magician();
		b.setId("마법사");
		b.setAttack(50);
		b.setHp(350);
		b.magic();
		b.print();
	}

}
