package oop.multi2;

public class Overlord extends Zerg implements FlyingUnit {

	@Override
	public void fly() {
		System.out.println("오버로드가 비행합니다.");
	}

	@Override
	public void attack() {
		System.out.println("오버로드는 공격할 수 없습니다.");
	}

}
