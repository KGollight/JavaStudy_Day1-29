package oop.multi2;

public class Overlord extends Zerg implements FlyingUnit {

	@Override
	public void fly() {
		System.out.println("�����ε尡 �����մϴ�.");
	}

	@Override
	public void attack() {
		System.out.println("�����ε�� ������ �� �����ϴ�.");
	}

}
