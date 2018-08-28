package oop.complex1;

public class Quiz01 {

	public static void main(String[] args) {
		Character java = new Character("ÀÚ.¹Ù.Á¶.¾Æ", "±â»ç");
		
		java.setLevel(30);
		java.setHp(1000);
		
		Weapon weapon = new Weapon("±¤¼±°Ë", 100, 15000);
		Armor armor = new Armor("Ã¶°©¿Ê", 30, 3000);
		
		java.print();
	}

}
