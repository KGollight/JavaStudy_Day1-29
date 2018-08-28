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
	
	// ���� ������ ����� �Ű������� �޸��Ͽ� ����
	//	-> �޼ҵ� �����ε�(overloading)
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
		System.out.println("*** ĳ���� ���� ***");
		System.out.println("ID : "+this.id);
		System.out.println("���� : "+this.job);
		System.out.println("���� : "+this.level);
		System.out.println("ü�� : "+this.hp);
	}
}
