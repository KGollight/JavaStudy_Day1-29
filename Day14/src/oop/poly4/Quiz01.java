package oop.poly4;

public class Quiz01 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*2);
		int b = (int)(Math.random()*2);
		
		// �����ϱ� ���� ���� ������ ���� ����
		Unit unit;
		
		if(a==0) {
			unit = new Zealot();
		}
		else {
			unit = new Dragoon();
		}
		
		// unit�� ���� �������� �𸣰����� �ش� �ν��Ͻ��� ���� ��� ����
		System.out.println("unit = "+unit);
		if(b==0)
			unit.move();
		else
			unit.attack();
	}

}
