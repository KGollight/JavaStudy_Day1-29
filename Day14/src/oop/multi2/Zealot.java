package oop.multi2;

public class Zealot extends Protoss implements GroundUnit {

	@Override
	public void attack() {
		System.out.println("질럿이 공격합니다.");
	}

	@Override
	public void walk() {
		System.out.println("질럿이 걷습니다.");
	}
	
}
