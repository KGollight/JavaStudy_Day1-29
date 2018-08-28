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
		System.out.println("*** 기기 상태 ***");
		System.out.println("설치 게임 : "+this.game);
		System.out.println("비용 : "+this.price+"원");
		System.out.println("이용 횟수 : "+this.times+"회");
		System.out.println("수입 : "+this.income+"원");
	}
}
