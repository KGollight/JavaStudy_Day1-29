package loop;

public class Quiz01 {

	public static void main(String[] args) {
		// ���� ���ݾ�
		// ù�� 10��, ��°������ ������ 2��
		int day = 1;
		long save = 10;
		long money = 0;
		
		while (day<=30) {
			System.out.println(day+"��°, ���ݾ��� "+save+"��, ���� �ݾ��� "+money+"�� �Դϴ�.");
			day++;
			save*=2;
			money = money+save;
		}
	}

}
