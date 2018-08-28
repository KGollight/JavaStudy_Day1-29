package oop.poly4;

public class Dragoon extends Unit {

	@Override
	public void move() {
		System.out.println("드라군이 이동합니다.");
	}

	@Override
	public void attack() {
		System.out.println("드라군이 공격합니다.");
	}
	
}