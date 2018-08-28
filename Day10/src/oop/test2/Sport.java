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
		System.out.println("***스포츠 종목 정보***");
		System.out.println("이름 : "+this.name);
		System.out.println("종류 : "+this.kind);
		System.out.println("인원 수 : "+this.player);
		System.out.println("=================\n");
	}
}
