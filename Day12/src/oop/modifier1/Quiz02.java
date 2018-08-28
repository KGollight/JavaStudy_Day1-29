package oop.modifier1;

public class Quiz02 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("»Ð¸ÁÄ¡", 13);
		Weapon w2 = new Weapon("¼Õ¹Ù´Ú", 5);
		Weapon w3 = new Weapon("ºü·ç", 23);
		
		Character ch1 = new Character("Â¯±¸", 20, w1);
		Character ch2 = new Character("»Ç·Î·Î", 25, w2);
		Character ch3 = new Character("¶Çº¿", 22, w3);
		
		ch1.print();
		ch2.print();
		ch3.print();
		
		// ch1ÀÇ °ø°Ý·ÂÀ» ¾Ë°í ½ÍÀ¸¸é
		System.out.println(ch1.getWeapon().getDamage());
		System.out.println(ch1.getDamage());
	}

}
