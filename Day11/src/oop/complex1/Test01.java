package oop.complex1;

public class Test01 {

	public static void main(String[] args) {
		// ������ ����� �ʹٸ�...
		Police p = new Police();
		
		p.name = "������";
		p.grade = "���";
		p.left = new Gun();
		p.right = new Gun();
		
		// ���� ������ �����Ϸ���
		p.left.name = "����";
		p.left.bullet = 6;
		
		p.right.name = "����";
		p.right.bullet = 8;
	}

}
