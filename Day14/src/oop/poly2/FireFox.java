package oop.poly2;

public class FireFox extends Browser {

	@Override
	public void info() {
		System.out.println("파이어폭스 브라우저의 정보출력 기능을 사용합니다.");
	}

	@Override
	public void develope() {
		System.out.println("파이어폭스 브라우저의 개발자 도구 기능을 사용합니다.");		
	}
	
	@Override
	public void music() {
		System.out.println("볼륨 최대로!");
	}
}
