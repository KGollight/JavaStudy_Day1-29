package oop.complex1;

public class Armor {
	String name;
	int defend;
	int price;
	
	Armor(String name, int defend, int price){
		this.name = name;
		this.defend = defend;
		this.price = price;
	}
	
	void print() {
		System.out.println("\n*** ���� ���� ***");
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.defend);
		System.out.println("���� : "+this.price);
	}
	
}
