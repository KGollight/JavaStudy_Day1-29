package api.util.date;

import java.util.Date;

public class Test04 {

	public static void main(String[] args) {
//		�ð� ���
		
//		���� �ð��� "�и���" ������ ��ȯ
		long time = System.currentTimeMillis();
		System.out.println("time = "+time);
		
		Date d = new Date(time-60000);
		System.out.println(d);
	}

}
