package oop.static3;

public class Iphone {
	static String company = "애플";
	static int memory = 64;
	
	String color;
	int price;
	
	Iphone(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	void print() {
		System.out.println("*** 아이폰X 정보 ***");
		System.out.println("제조사 : "+Iphone.company);
		System.out.println("메모리 : "+Iphone.memory+"GB");
		System.out.println("색상 : "+this.color);
		System.out.println("가격 : "+this.price+"만원");
		System.out.println();
	}
}
