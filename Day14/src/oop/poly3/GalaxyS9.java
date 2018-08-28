package oop.poly3;

public class GalaxyS9 extends Phone {

	@Override
	public void power() {
		System.out.println("갤럭시의 전원 기능 사용");
	}

	@Override
	public void call() {
		System.out.println("갤럭시의 통화 기능 사용");
	}
	
	public void vixbee() {
		System.out.println("갤럭시의 빅스비 호출");
	}
}
