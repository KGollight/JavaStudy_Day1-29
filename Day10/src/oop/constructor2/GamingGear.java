package oop.constructor2;

public class GamingGear {
	String game;
	int price;
	int income;
	int times;
	
	GamingGear(String game, int price) {
		this.game = game;
		this.price = price;
		this.income = 0;
	}
	
	void play() {
		this.times++;
		this.income = this.price*this.times;
	}
	
	void play(int times) {
		for(int i=0; i<times; i++) {
			this.play();
		}
	}
	
	void print() {
		System.out.println("*** ��� ���� ***");
		System.out.println("��ġ ���� : "+this.game);
		System.out.println("��� : "+this.price+"��");
		System.out.println("�̿� Ƚ�� : "+this.times+"ȸ");
		System.out.println("���� : "+this.income+"��");
	}
}
