package oop.static2;

public class Test01 {

	public static void main(String[] args) {
		Sonata a = new Sonata("����", 20000000);
		Sonata b = new Sonata("��", 21000000);
		Sonata c = new Sonata("�ǹ�", 20500000);
		
//		a.company = "BMW";
//		a.maxSpeed = 300;
		
		Sonata.company = "BMW";
		Sonata.maxSpeed = 300;
		
		a.print();
		b.print();
		c.print();
	}

}
