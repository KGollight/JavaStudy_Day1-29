package oop.multi2;

public class Wraith extends Terran implements FlyingUnit {

	@Override
	public void fly() {
		System.out.println("레이스가 비행합니다.");
	}

	@Override
	public void attack() {
		System.out.println("레이스가 공격합니다.");
	}

}
