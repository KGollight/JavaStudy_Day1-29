package oop.test2;

public class Quiz02 {

	public static void main(String[] args) {
		// ������ ����
		WorldCup fra = new WorldCup();
		WorldCup cro = new WorldCup();
		WorldCup bel = new WorldCup();
		WorldCup eng = new WorldCup();
		
		fra.insert(1, "������", "����", "�׸��");
		cro.insert(2, "ũ�ξ�Ƽ��", "����", "��帮ġ");
		bel.insert(3, "���⿡", "����", "���������");
		eng.insert(4, "�ױ۷���", "����", "�ظ�����");
		
		// ���
		System.out.println("����\t"+"�̸�\t"+"����\t"+"��ǥ����\t");
		fra.print();
		cro.print();
		bel.print();
		eng.print();
	}

}
