package oop.staticfinal1;

public class Test01 {

	public static void main(String[] args) {
		// ���������� ����
		// ����(0), ����(1), ��(2)
		int com = (int)(Math.random()*3);
		
		switch(com) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
	}

}
