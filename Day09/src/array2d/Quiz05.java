package array2d;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/* �ζ� �Ǹű� �����
		 * ����ڿ��� ������ �ζ� ����� �Է¹޾� ������ ���� ó��
			- ��� �����Ϳ��� �ߺ����� ������ �� �����ϴ�
			- ��� �����ʹ� ��ȣ�� "��������"���� ���ĵǾ� ��µ˴ϴ�.
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("***������ �ζ� ����� �Է��ϼ���.***");
		System.out.print("�ζ� ��� �Է� : ");
		int ea = s.nextInt();
		
		s.close();
		
		int num = (int)(Math.random() * 45) + 1;
		System.out.println("num = "+num);
		
//		1�� �ζ� ��ȣ ��÷(6��) - �ߺ��� ������ �ذ��ؾ���
		int[] t = new int[6];
		for(int i=0; i < t.length; i++) {
			t[i] = (int)(Math.random() * 45) + 1;

//			0������ (i-1)������ ��ġ�� ���鼭 t[i]�� ���� ���ڰ� �ִ��� �˻�(�ߺ��˻�)
			for(int j=0; j < i; j++) {
				if(t[i] == t[j]) {//�ߺ� �߻���
					System.out.println("�ߺ�!");
					i--;
					break;
				}
			}
		}

//		����(���� ����)
		for(int k=0; k < t.length - 1; k++) {
			int min = k;
			for(int i=k+1; i < t.length; i++) {
				if(t[min] > t[i]) {
					min = i;
				}
			}
			
			int tmp = t[k];
			t[k] = t[min];
			t[min] = tmp;
		}
		
		for(int i=0; i < t.length; i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
//		1�� �ζ� ��ȣ ��÷(6��x5��)
		
		int[][] lotto = new int[5][6];
		
		for(int k=0; k < lotto.length; k++) {
			for(int i=0; i < t.length; i++) {
				t[i] = (int)(Math.random() * 45) + 1;

//				0������ (i-1)������ ��ġ�� ���鼭 t[i]�� ���� ���ڰ� �ִ��� �˻�(�ߺ��˻�)
				for(int j=0; j < i; j++) {
					if(t[i] == t[j]) {//�ߺ� �߻���
						System.out.println("�ߺ�!");
						i--;
						break;
					}
				}
			}

//			����(���� ����)
			for(int w=0; w < t.length - 1; w++) {
				int min = w;
				for(int i=w+1; i < t.length; i++) {
					if(t[min] > t[i]) {
						min = i;
					}
				}
				
				int tmp = t[w];
				t[w] = t[min];
				t[min] = tmp;
			}
		}
		
	}
}
