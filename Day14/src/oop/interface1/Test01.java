package oop.interface1;

public class Test01 {

	public static void main(String[] args) {
		// Func�� �ν��Ͻ�ȭ �� �� �ִ°�?
		// - �ȵǴ� ���� ��Ģ������ �͸���øŬ������ �����ϴ�
		
		Func a = new Func() {
			public void hello() {
				System.out.println("�ݰ���!");
			}
		};
		a.hello();
		
		// �Լ��� �������̽��� Ư���� ������ ���
		Func b = /*new Func() {*/
				/*public void hello()*/() -> {
				System.out.println("�ݰ���!");
			}
		/*};*/;
		b.hello();
		
		// �̷��� ���� ���¸� ����(lambda)��� �θ���.
		// - ���ٸ� �ַ� ���� ���¸� �Լ��� ���α׷����̶� �θ���.
		Func c = () -> {
			System.out.println("�ȳ��ϽŰ�!");
		};
	}

}
