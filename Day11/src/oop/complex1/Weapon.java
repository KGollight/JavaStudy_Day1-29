package oop.complex1;

public class Weapon {
	String name;
	int damage;
	int price;
	
	Weapon(String name, int damage, int price){
		this.name = name;
		this.damage = damage;
		this.price = price;
	}
	
	void print() {
		System.out.println("\n*** 무기 정보 ***");
		System.out.println("이름 : "+this.name);
		System.out.println("공격력 : "+this.damage);
		System.out.println("가격 : "+this.price);
	}
}
