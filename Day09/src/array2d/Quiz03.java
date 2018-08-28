package array2d;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 빙고판만들기
		// 사용자에게 원하는 크기를 입력받아서 해당 크기의 랜덤 빙고판을 화면에 출력
		Scanner s = new Scanner(System.in);
		System.out.println("***원하는 빙고판 크기를 입력하세요.(홀수만 가능)***");
		System.out.print("빙고판 크기 입력 : ");
		int size = s.nextInt();
		
		s.close();

		int[][] bingo = new int[size][size];
		
		// 값 설정(1부터 size*size까지)
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
		
		//출력
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
