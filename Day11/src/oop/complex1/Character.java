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
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("ID : "+this.id);
		System.out.println("직업 : "+this.job);
		System.out.println("레벨 : "+this.level);
		System.out.println("체력 : "+this.hp);
		
		this.weapon.print();
		this.armor.print();
	}
}
