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
		System.out.println("\n*** ���� ���� ***");
		System.out.println("�̸� : "+this.name);
		System.out.println("���ݷ� : "+this.damage);
		System.out.println("���� : "+this.price);
	}
}
