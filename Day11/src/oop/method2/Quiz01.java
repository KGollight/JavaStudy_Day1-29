package oop.method2;

public class Quiz01 {

	public static void main(String[] args) {
		/* 1ȸ�� �޼ҵ带 ���� �� �̿�
		 * [1] ������ ���ϴ� �޼ҵ�
		 * [2] x�� y������ ���ϴ� �޼ҵ�
		 * [3] �ﰢ�� ���̸� ���ϴ� �޼ҵ�
		 * [4] ���� ���̸� ���ϴ¸޼ҵ�
		 * [5] ���ϴ� ������ ���� �������� ��ȯ�ϴ� �޼ҵ�
		 * */
		Utility util = new Utility();
		
		int num1 = util.mul(3);
		long num2 = util.mulx(2, 10);
		double num3 = util.triangle(5, 3);
		double num4 = util.circle(5);
		int num5 = util.random(1, 5);
		
		System.out.println("[1] : "+num1);
		System.out.println("[2] : "+num2);
		System.out.println("[3] : "+num3);
		System.out.println("[4] : "+num4);
		System.out.println("[5] : "+num5);
	}

}
