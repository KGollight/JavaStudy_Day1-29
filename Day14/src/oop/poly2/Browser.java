package oop.poly2;

public abstract class Browser {
	protected String url;
	
	public abstract void info();
	
	public abstract void develope();
	
	public final void move(String url) {
		System.out.println("이동 메세지 출력");
	}
	
	public void music() {
		System.out.println("음악을 재생합니다!");
	}
}
