package loop3;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("***�ð��� �Է��ϼ���***");
		System.out.print("�� : ");
		int min = s.nextInt();
		System.out.print(" �� : ");
		int second = s.nextInt();
		System.out.print("\n");
		
		s.close();
		
		int time = min*60+second;
		
		for(int i=time; i>0; i--) {
			System.out.println(i/60+"�� "+i%60+"�� �Ŀ� �˶��� �︳�ϴ�...");
			
			// 1�� ���� �ڵ�(1000�и���)
			Thread.sleep(1000L);
		}
		System.out.println("�ð��� �� �Ǿ����ϴ�!");
	}

}
