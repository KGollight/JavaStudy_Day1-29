package api.lang.object;

public class Test01 {

	public static void main(String[] args) {
		
		// ObjectŬ������ �ڹ��� �ֻ��� Ŭ����(��� ������ �ֻ���)
		// - Ŭ������� �ݵ�� �������� ��ɵ��� �����صξ���
		Object a = new Object();
		Object b = new Object();
		
		System.out.println(a.getClass());	// ���� Ŭ���� ������ ��ȯ
		System.out.println(a.hashCode());	// �ν��Ͻ� �Ϸù�ȣ�� ��ȯ
		System.out.println(a.toString());	// �ν��Ͻ� ��������� ��ȯ
		
		System.out.println(b.hashCode());
	}

}
