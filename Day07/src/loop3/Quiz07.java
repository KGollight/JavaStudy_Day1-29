package loop3;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ���ڰ� �Ҽ����� ������ ���
		Scanner s = new Scanner(System.in);
		System.out.println("***���ڸ� �Է��ϼ���***");
		int num = s.nextInt();
		
		s.close();
		
		int count=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
			if(count==2)
				break;
		}
		if(count==2)
			System.out.println(num+"��(��) �Ҽ��Դϴ�.");
		else
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�.");
	}

}
