package oop.static1;

// �ҳ�Ÿ Ŭ���� = ������ + ���� + ���� + �ְ�ӵ� + ...
public class Sonata {
	String company;
	String color;
	int price;
	int maxSpeed;
	
	Sonata(String color, int price){
		this.company = "����";
		this.color = color;
		this.price = price;
		this.maxSpeed = 250;
	}
	
	void print() {
		System.out.println("## �ҳ�Ÿ ���� ##");
		System.out.println("������ : "+this.company);
		System.out.println("���� : "+this.color);
		System.out.println("���� : "+this.price+"��");
		System.out.println("�ְ�ӵ� : "+this.maxSpeed+"km");
	}
}
