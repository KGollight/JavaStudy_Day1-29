package api.thread;

public class Test01 {

	public static void main(String[] args) {
//		�ڹ��� ��� ���α׷��� �����带 ������� �۵��Ѵ�
//		 -> �ڹٿ����� Thread��� Ŭ������ Runnable�̶�� �������̽��� ó�� ����
		
//		�� ���α׷��� ������ ������ ���
//		Thread[main,5,main]
//		1��° ������ �������� �̸�
//		2��° ������ �������� �켱����(1~10���� �ְ�, �������� �߿���)
//		3��° ������ �������� ���� ���
		System.out.println(Thread.currentThread());
	}

}
