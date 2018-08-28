package oop.poly5;

// 추상 클래스
// - 특별한 경우가 아니면 인스턴스화 되면 안된다
// - 변수, 메소드(추상/일반), 생성자, 클래스
public class Player {
	protected String id;
	protected String job;
	protected int level;
	
	// public		외부에서도 생성할 수 있도록 허용하는 생성자
	// protected	외부에서는 생성할 수 없도록 제한하는 생성자
	public Player(String id, String job) {
		this.id=id;
		this.job=job;
	}
	
	public void attack() {
		
	}
}
