package oop.modifier1;

public class Test01 {

	public static void main(String[] args) {
		// Student�� �ν��Ͻ��� �����Ͽ� ���� ����
		
		// ����
		Student std = new Student();
		
		// �ʱ�ȭ
		// std.name = "ȫ�浿";
		std.setName("ȫ�浿");
		std.setScore(-50);
		
		// ���
		System.out.println(std.getName());
		System.out.println(std.getScore());
	}

}
