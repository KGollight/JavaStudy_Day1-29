package api.lang.wrapper;

public class Test02 {

	public static void main(String[] args) {
		// �������� ����ϸ� ���� ��� - ������ 2������ ��ȯ�Ͽ� ���
		
		// ������
		int a=10;	// -----> (2����) 1010
		
		String b="";
		
		for(int i=a; i>0; i/=2) {
			b=i%2+b;
		}
		System.out.println("b = "+b);
		
		// ������
		System.out.println(Integer.toBinaryString(a));
	}

}
