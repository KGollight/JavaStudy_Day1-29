package oop.poly2;

public abstract class Browser {
	protected String url;
	
	public abstract void info();
	
	public abstract void develope();
	
	public final void move(String url) {
		System.out.println("�̵� �޼��� ���");
	}
	
	public void music() {
		System.out.println("������ ����մϴ�!");
	}
}
