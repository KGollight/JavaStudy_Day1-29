package api.text.decimal;

import java.text.DecimalFormat;

public class Test02 {

	public static void main(String[] args) {
//		#과 0의 차이
		
		int a = 10;
		
		DecimalFormat f1 = new DecimalFormat("#,###.##");
		DecimalFormat f2 = new DecimalFormat("0,000.00");
		
		System.out.println("a = "+f1.format(a));
		System.out.println("a = "+f2.format(a));
	}

}
