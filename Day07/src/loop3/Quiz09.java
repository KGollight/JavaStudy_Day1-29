package loop3;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// ����ڰ� ������ �Է��ϸ� �ش��ϴ� ������ �����ϴ� ��� �Ҽ� ���
		Scanner s = new Scanner(System.in);
		System.out.println("***���ڸ� �Է��ϼ���***");
		System.out.println("***������ �Է��ϼ���***");
		System.out.print("���� : ");
		int start = s.nextInt();
		System.out.print("\n�� : ");
		int end = s.nextInt();
		int count2=0;
				
		s.close();
			
		for(int j=start; j<=end; j++) {
			for(int k=1; k<=j; k++) {
				if(j%k==0) {
					count2++;
				}
			}
			if(count2==2)
				System.out.println(j+"��(��) �Ҽ��Դϴ�.");
		}
	}

}
