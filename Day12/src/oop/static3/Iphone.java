package oop.static3;

public class Iphone {
	static String company = "����";
	static int memory = 64;
	
	String color;
	int price;
	
	Iphone(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	void print() {
		System.out.println("*** ������X ���� ***");
		System.out.println("������ : "+Iphone.company);
		System.out.println("�޸� : "+Iphone.memory+"GB");
		System.out.println("���� : "+this.color);
		System.out.println("���� : "+this.price+"����");
		System.out.println();
	}
}
