package oop.static1;

public class Test01 {

	public static void main(String[] args) {
		Sonata a = new Sonata("와인", 20000000);
		Sonata b = new Sonata("블랙", 21000000);
		Sonata c = new Sonata("실버", 20500000);
		
		a.print();
		b.print();
		c.print();
	}

}
