package loop3;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// [1] ����ڿ��� ���� 2�� �Է¹޾� ��������Ͽ� ���
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("���ڸ� �Է��ϼ���");
		int b = s.nextInt();
		int result = a;
		
		for(int i=1; i<b; i++) {
			result*=a;
		}
		System.out.println("����� : "+result);
		
		// [2] ����ڿ��� ���� �Ѱ� �Է¹޾� ���丮�� ��� ����
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		
		s.close();
		
		if(num>=0) {
			int fact=1;
			for(int i=num; i>=1; i--) {
				System.out.println(num+"*"+(num-1));
				fact*=i;
			}
			System.out.println("����� : "+fact);
		}
		else
			System.out.println("���� �Է� �Ұ�");
	}

}
