package oop.modifier1;

public class Quiz01 {

	public static void main(String[] args) {
		Phone ph1 = new Phone("G7", "LG", 1200000);
		Phone ph2 = new Phone("GalaxyS9", "SK", 1300000);
		Phone ph3 = new Phone("IPhoneX", "KT", 1350000);
		Phone ph4 = new Phone("¿ÃªÛ«ÿ", "§ª§ª", -50000);
		
		ph1.print();
		ph2.print();
		ph3.print();
		ph4.print();
	}

}
