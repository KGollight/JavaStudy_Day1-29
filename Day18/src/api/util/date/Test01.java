package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
//		Date�� �̿��� �ð��� �о����
		Date a = new Date();
		System.out.println("a = "+a);
		
//		Date b = new Date(2018, 8, 3);
		Date b = new Date(118, 7, 3);
		System.out.println("b = "+b);
		
//		a�� ������ ���� - SimpleDateFormat�ʿ�(java.text)
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		Format f = new SimpleDateFormat("yyyy/MM/dd hh�� mm��");
		
		System.out.println("a = "+f.format(a));
	}

}
