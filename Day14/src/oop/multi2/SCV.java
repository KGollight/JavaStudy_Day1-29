package oop.multi2;

public class SCV extends Terran implements GroundUnit, Worker {

	@Override
	public void mine() {
		System.out.println("SCV가 자원을 채취합니다.");
	}

	@Override
	public void walk() {
		System.out.println("SCV가 이동합니다.");
	}

	@Override
	public void attack() {
		System.out.println("SCV가 공격합니다.");
	}

}
