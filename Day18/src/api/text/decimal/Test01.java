package api.text.decimal;

import java.text.DecimalFormat;

public class Test01 {

	public static void main(String[] args) {
//		,를 쓰면 해당하는 위치에 그룹 기호가 추가된다.(패턴으로 인식하여 반복적으로 수행)
//		#은 숫자가 출력됨을 의미
//		.은 소수점을 의미
		
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
