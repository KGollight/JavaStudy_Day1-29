package oop.constructor2;

public class Quiz01 {

	public static void main(String[] args) {
		// ĳ���� �����
		Character java = new Character("�ڹ�", "����");
		Character python = new Character("���̽�", "������");
		Character spring = new Character("������", "����");
		
		java.levelUp(5);
		spring.levelUp(10);
		
		java.print();
		python.print();
		spring.print();
	}

}
