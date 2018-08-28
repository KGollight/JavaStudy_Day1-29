package oop.constructor2;

public class Character {
	String id, job;
	int level, hp, gold;
	
	Character(String id, String job){
		this.id = id;
		this.job = job;
		this.level = 1;
		this.hp = 10;
		this.gold = 0;
	}
	
	// 같은 종류의 기능을 매개변수를 달리하여 구현
	//	-> 메소드 오버로딩(overloading)
	void levelUp() {
		this.level++;
		this.hp+=5;
	}
	
	void levelUp(int level) {
		for(int i=0; i<level; i++) {
			this.levelUp();
		}
	}
	
	void print() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("ID : "+this.id);
		System.out.println("직업 : "+this.job);
		System.out.println("레벨 : "+this.level);
		System.out.println("체력 : "+this.hp);
	}
}
