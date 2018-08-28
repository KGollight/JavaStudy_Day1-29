package oop.complex1;

public class Character {
	String id;
	String job;
	int level;
	int hp;
	
	Weapon weapon;
	Armor armor;
	
	Character(String id, String job){
		this.setId(id);
		this.setJob(job);
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	void setJob(String job) {
		this.job = job;
	}
	
	void setLevel(int level) {
		this.level = level;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	void print() {
		System.out.println("*** ĳ���� ���� ***");
		System.out.println("ID : "+this.id);
		System.out.println("���� : "+this.job);
		System.out.println("���� : "+this.level);
		System.out.println("ü�� : "+this.hp);
		
		this.weapon.print();
		this.armor.print();
	}
}
