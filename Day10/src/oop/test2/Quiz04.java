package oop.test2;

public class Quiz04 {

	public static void main(String[] args) {
		// �޴���
		Menu kim = new Menu();
		Menu ram = new Menu();
		Menu ameri = new Menu();
		Menu capu = new Menu();
		
		kim.insert("���", "�Ļ�", 3000, true);
		ram.insert("���", "�Ļ�", 2500, false);
		ameri.insert("�Ƹ޸�ī��", "����", 2000, true);
		capu.insert("īǪġ��", "����", 3000, false);
		
		System.out.println("***�޴���***");
		System.out.println("�̸�\t"+"����\t"+"����\t"+"����ǰ");
		kim.print();
		ram.print();
		ameri.print();
		capu.print();
	}

}
