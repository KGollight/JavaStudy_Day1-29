package api.lang.wrapper;

public class Test03 {

	public static void main(String[] args) {
		// int�� Integer�� ���� ���·� ����Ͽ� �����Ӱ� ȣȯ�� �����ϴ�.
		// - ��, �ȵǴ� ���� �ݵ�� ���¸� ����� ��!
		
		// a�� b�� �����ϰ�, c�� d�� �����ϴ�.
		Integer a = 10;
		Integer b = 10;
		
		Integer c = new Integer(10);
		Integer d = new Integer(10);
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(a==b);	// true
		System.out.println(c==d);	// false
		
		// ������ ��쿡�� ���� ���ϴ� ����� ���� ����
		System.out.println(c.equals(d));	// true
	}

}
