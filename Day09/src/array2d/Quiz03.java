package array2d;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// �����Ǹ����
		// ����ڿ��� ���ϴ� ũ�⸦ �Է¹޾Ƽ� �ش� ũ���� ���� �������� ȭ�鿡 ���
		Scanner s = new Scanner(System.in);
		System.out.println("***���ϴ� ������ ũ�⸦ �Է��ϼ���.(Ȧ���� ����)***");
		System.out.print("������ ũ�� �Է� : ");
		int size = s.nextInt();
		
		s.close();

		int[][] bingo = new int[size][size];
		
		// �� ����(1���� size*size����)
		for(int i=1; i<=size*size; i++) {
			int x = (int)(Math.random()*size);
			int y = (int)(Math.random()*size);
			
			if(bingo[x][y]==0) {
				bingo[x][y]=i;
			} 
			else {
				i--;
			}
		}
		
		//���
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
