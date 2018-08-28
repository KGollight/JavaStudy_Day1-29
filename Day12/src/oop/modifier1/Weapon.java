package oop.modifier1;

public class Weapon {
	private String name;
	private int damage;
	
	Weapon(String name, int damage){
		this.setName(name);
		this.setDamage(damage);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setDamage(int damage) {
		if(damage<1)
			return;
		else
			this.damage = damage;
	}
	
	String getName() {
		return name;
	}
	
	int getDamage() {
		return damage;
	}
}
