package oop.multi2;

public class SCV extends Terran implements GroundUnit, Worker {

	@Override
	public void mine() {
		System.out.println("SCV�� �ڿ��� ä���մϴ�.");
	}

	@Override
	public void walk() {
		System.out.println("SCV�� �̵��մϴ�.");
	}

	@Override
	public void attack() {
		System.out.println("SCV�� �����մϴ�.");
	}

}
