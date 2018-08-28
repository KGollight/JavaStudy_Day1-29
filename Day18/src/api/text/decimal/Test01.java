package api.text.decimal;

import java.text.DecimalFormat;

public class Test01 {

	public static void main(String[] args) {
//		,�� ���� �ش��ϴ� ��ġ�� �׷� ��ȣ�� �߰��ȴ�.(�������� �ν��Ͽ� �ݺ������� ����)
//		#�� ���ڰ� ��µ��� �ǹ�
//		.�� �Ҽ����� �ǹ�
		
		int a = 1234567890;
		
		System.out.println("a = "+a);
		
		DecimalFormat f = new DecimalFormat("#,###");
		
		String b = f.format(a);
		
		System.out.println("b = "+b);
		
		double c = 1234.56789;
		
		System.out.println("c = "+c);
		System.out.println("c = "+f.format(c));
		
		DecimalFormat f2 = new DecimalFormat("#,###.##");
		System.out.println("c = "+f2.format(c));
	}

}
