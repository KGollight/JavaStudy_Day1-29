package loop2;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int input;
		int life = 3;
		int combo = 0;
		int score = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("***������ ����!***");
		
		while(true) {
			int num1 = (int)(Math.random()*9)+1;
			int num2 = (int)(Math.random()*9)+1;
			int result = num1*num2;
			
			System.out.print("�������� ����! "+num1+" * "+num2+" = ");
			input = s.nextInt();
			
			if(input==result) {
				System.out.println("����!");
				combo++;
				if(combo>=2) {
					score=score+10*combo;
					System.out.println(combo+"�޺�! ���� "+score+"��!");
				}
				else {
					score+=10;
					System.out.println("10�� ȹ��");
				}
			}
			else {
				System.out.println("��~!!! ������ "+result+"�����ϴ�~");
				life--;
				combo=0;
			}
			
			if(life==0)
				break;
		}
		System.out.println("������ ����Ǿ����ϴ�.");
		System.out.println("����ڴ��� ������ "+score+"�� �Դϴ�.");
	}

}
