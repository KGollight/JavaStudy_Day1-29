package loop3;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ���ڰ� 7�� � ������ �ֳ�
		Scanner s = new Scanner(System.in);
		System.out.println("***���ڸ� �Է��ϼ���***");
		int num = s.nextInt();
		int cla = 0;
		int seven = 0;
		
		for(int j=num; j>0; j/=10) {
			if(j%10==7) {
				seven++;
			}
		}
		System.out.println("7�� ���� : "+seven);
		
		s.close();
		
		//if()
		// 1~1000������ ���ڸ� �˻��Ͽ� 7�� �� �� �ִ��� ���Ͽ� ȭ�鿡 ���
		int start = 1;
		int finish = 1000;
		int check = 7;
		int count=0;
		/*for(int i=start; i<=finish; i++) {
			int a=i/100;
			int b=i%100/10;
			int c=i%10;
			
			if(a==7) {
				count++;
			}
			if(b==7) {
				count++;
			}
			if(c==7) {
				count++;
			}
		}*/
		for(int i=start; i<=finish; i++) {
			for(int k=i; k>0; k/=10) {
				if(i%10==check) {
					count++;
				}
			}
		}
		System.out.println("1~1000������ 7���� : "+count);
	}

}
