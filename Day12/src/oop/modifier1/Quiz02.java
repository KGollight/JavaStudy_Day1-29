package oop.modifier1;

public class Quiz02 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("�и�ġ", 13);
		Weapon w2 = new Weapon("�չٴ�", 5);
		Weapon w3 = new Weapon("����", 23);
		
		Character ch1 = new Character("¯��", 20, w1);
		Character ch2 = new Character("�Ƿη�", 25, w2);
		Character ch3 = new Character("�Ǻ�", 22, w3);
		
		ch1.print();
		ch2.print();
		ch3.print();
		
		// ch1�� ���ݷ��� �˰� ������
		System.out.println(ch1.getWeapon().getDamage());
		System.out.println(ch1.getDamage());
	}

}
