package oop.test2;

public class Sport {
	String name;
	String kind;
	int player;
	
	void insert(String name, String kind, int player) {
		this.name = name;
		this.kind = kind;
		this.player = player;
	}
	
	void print() {
		System.out.println("***������ ���� ����***");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.kind);
		System.out.println("�ο� �� : "+this.player);
		System.out.println("=================\n");
	}
}
