package oop.static2;

// �ҳ�Ÿ Ŭ���� = ������ + ���� + ���� + �ְ�ӵ� + ...
public class Sonata {
	// �ϰ� ������ ������
	static String company = "����";
	static int maxSpeed = 250;
	
	// ���� ������ ������
	String color;
	int price;
	
	Sonata(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	void print() {
		System.out.println("## �ҳ�Ÿ ���� ##");
		//System.out.println("������ : "+this.company);
		System.out.println("������ : "+Sonata.company);
		System.out.println("���� : "+this.color);
		System.out.println("���� : "+this.price+"��");
		//System.out.println("�ְ�ӵ� : "+this.maxSpeed+"km");
		System.out.println("�ְ�ӵ� : "+Sonata.maxSpeed+"km");
		System.out.println();
	}
}
