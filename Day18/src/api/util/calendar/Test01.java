package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
//		Calendar
//		 - �ð��� �ϰ����� ���� ���� ���� �Ұ�(�߻� Ŭ����)
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		�ð� ����	c.seet(�׸�, ��)
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 10);
		
//		[1] ���� �����͸� ���������	c.get(int);
		System.out.println(c.get(Calendar.YEAR));//����
		System.out.println(c.get(Calendar.MONTH)+1);//��(0~11)
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//��
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//��
		System.out.println(c.get(Calendar.MINUTE));//��
		System.out.println(c.get(Calendar.SECOND));//��
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//����
		
//		[2] Date�� ��ȯ�Ͽ� ���
		Date d = c.getTime();
		Format f = new SimpleDateFormat("y-MM-dd E a hh:mm:ss");
		System.out.println(f.format(d));
	}

}
