package oop.modifier1;

public class Character {
	private String id;
	private int level;
	private Weapon wp;
	
	Character(String id, int level, Weapon wp){
		this.setId(id);
		this.setLevel(level);
		this.setWeapon(wp);
	}
	
	void setId(String id) {
		if(id.length()<2)
			return;
		else
			this.id = id;
	}
	
	void setLevel(int level) {
		if(level<1)
			return;
		else
			this.level = level;
	}
	
	String getId() {
		return id;
	}
	
	int getLevel() {
		return level;
	}
	
	void setWeapon(Weapon wp) {
		this.wp = wp;
	}
	
	Weapon getWeapon() {
		return wp;
	}
	
	void print() {
		System.out.println("*** ĳ���� ���� ***");
		System.out.println("ID : "+this.getId());
		System.out.println("���� : "+this.getLevel());
		System.out.println("*����*");
		System.out.println("�̸� : "+this.getWeapon().getName());
		System.out.println("���ݷ� : "+this.getWeapon().getDamage());
		System.out.println();
	}
	
	int getDamage() {
		if(wp==null)
			return 0;
		else
			return wp.getDamage();
	}
}
