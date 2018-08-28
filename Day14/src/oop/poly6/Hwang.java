package oop.poly6;

public class Hwang extends Teacher {

	@Override
	public void teach() {
		System.out.println("황쌤 강의중!");
	}
	
	// 기능 추가
	public void drink() {
		System.out.println("황쌤 술 먹는중!");
	}
	
	public void game() {
		System.out.println("황쌤 게임중!");
	}
}
