package api.lang.string;

public class Test05 {

	public static void main(String[] args) {
		//�ٸ� �ڷ������� ���ڿ��� ��ȯ or �ٽ� �ǵ�����
		int a = 10;
//		String b = a;
		String b = ""+a;
		String c = String.valueOf(a);
		
		System.out.println(b);
		System.out.println(c);
	}

}
