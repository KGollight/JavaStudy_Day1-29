package loop2;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		int count = 0;
		int num = (int)(Math.random()*1000)+1;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			count++;
			System.out.print("������ �Է��ϼ��� : ");
			int input = s.nextInt();
			
			if(input>num)
				System.out.println("�ٿ�!");
			else if(input<num)
				System.out.println("��!");
			else
				break;
		}
		s.close();
		
		System.out.println("***�����մϴ�!!!***");
		System.out.println(count+"ȸ���� ������ ���߼̽��ϴ�.");
	}

}
