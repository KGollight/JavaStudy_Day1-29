package oop.test1;

public class Test01 {

	public static void main(String[] args) {
		// Message ����
		// �ν��Ͻ� ����
		Message a = new Message();
		
		// Message			�ڷ���
		// a				���۷���(������)
		// new Message()	�ν��Ͻ� ����
		
		// ������ �ʱ�ȭ
		a.name = "������";
		a.text = "������ ����...";
		a.time = "���� 12:00";
		a.number = 1;
		
		System.out.println(a);
		System.out.println(a.name);
		System.out.println(a.text);
		System.out.println(a.time);
		System.out.println(a.number);
	}

}
