package api.lang.wrapper;

public class Test01 {

	public static void main(String[] args) {
		// int(������) - ���� �̿��Ͽ� �ܼ� ����� �����ϰ� ������ ó���Ѵ�.
		// 			 - ������ ����� �����.
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		// Integer(������) - �پ��� ���� ��ɵ��� ���� ������ ������ ���� ó���Ѵ�.
		// 				 - �ܼ� ����� ������ �����.
		Integer d = new Integer(10);
		Integer e = new Integer(20);
		Integer f = Integer.sum(d, e);
		System.out.println(f);
	}

}
