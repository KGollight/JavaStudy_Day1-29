package loop3;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/* String�̶�� �ڷ����� ������ �ڷ������μ� ������ ���� ��� 2������ ����Ǿ� �ֽ��ϴ�.
		 * .length()	���� ������ ��ȯ
		 * .charAt(i)	i��° ���ڸ� char�� ��ȯ
		 * ����ڿ��� ���ڿ��� �� �� �Է¹޾� �ѱ۷θ� �̷���� �ִ����� �����Ͽ� ����ϼ���
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���...");
		String text = s.next();
		int ea = text.length();
		System.out.println("���� �� : "+ea);
		
		s.close();
		
		char han;
		int count=0;
		
		for(int i=0; i<ea; i++) {
			han = text.charAt(i);
			if(han>='��' && han<='�R') {
				count++;
			}
		}
		if(ea==count)
			System.out.println("�ѱ۷θ� �̷�����ֽ��ϴ�.");
		else
			System.out.println("������ �����ڷδ�...");
	}
}
