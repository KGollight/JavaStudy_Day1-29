package api.text.decimal;

import java.text.DecimalFormat;

public class Test03 {

	public static void main(String[] args) {
		
//		6�ڸ��� ���� OTP��ȣ�� ���
		int otp = (int)(Math.random()*999999);
		
		DecimalFormat f = new DecimalFormat("000000");
		
		System.out.println("otp = "+f.format(otp));
		
	}

}
