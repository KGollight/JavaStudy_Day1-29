package oop.complex1;

public class Quiz01 {

	public static void main(String[] args) {
		Character java = new Character("��.��.��.��", "���");
		
		java.setLevel(30);
		java.setHp(1000);
		
		Weapon weapon = new Weapon("������", 100, 15000);
		Armor armor = new Armor("ö����", 30, 3000);
		
		java.print();
	}

}
