package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String ����
		String a = "hello";
		String b = "hello";
		
		String c = new String("hello");
		String d = new String("hello");
		
		//a�� b�� ����, c�� d�� ����
		System.out.println(a==b);	//true
		System.out.println(c==d);	//false
		System.out.println(c.equals(d));	//true(�ַ� ���)
		
		String e = "Hello";
		System.out.println(a.equals(e));	//false(��ҹ��� ������)
		System.out.println(a.equalsIgnoreCase(e));	//true(��ҹ��� ����)
	}

}
