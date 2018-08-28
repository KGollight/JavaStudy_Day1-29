package oop.poly3;

public class IphoneX extends Phone {

	@Override
	public void power() {
		System.out.println("아이폰X의 전원 기능 사용");
	}

	@Override
	public void call() {
		System.out.println("아이폰X의 통화 기능 사용");
	}
	
}