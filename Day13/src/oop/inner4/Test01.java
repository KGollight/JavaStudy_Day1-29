package oop.inner4;

public class Test01 {

	public static void main(String[] args) {
		Airplane a = new Airplane() {
			// �͸� Ŭ���� ����
			// - ������ �Ǵ��߰��� ������ �� �ִ�
			
			// �޼ҵ� ������(override)
			public void attack() {
				System.out.println("����ź �߻�!");
			}
			
			public void bomb() {
				System.out.println("��������!");
			}
		};
		
		Airplane b = new Airplane() {
			public void attack() {
				System.out.println("���߱���!");
			}
			
			public void bomb() {
				System.out.println("�Ʊ� ����!");
			}
		};
		
		a.attack();
		a.bomb();
		a.move();
		
		b.attack();
		b.bomb();
		b.move();
	}

}
