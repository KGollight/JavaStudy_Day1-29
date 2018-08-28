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
		System.out.println("\n*** 갑옷 정보 ***");
		System.out.println("이름 : "+this.name);
		System.out.println("방어력 : "+this.defend);
		System.out.println("가격 : "+this.price);
	}
	
}
