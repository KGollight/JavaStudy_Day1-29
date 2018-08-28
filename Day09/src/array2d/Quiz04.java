package array2d;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/* 마방진 만들기
		 * 마방진은 가로/세로/대각 어느 방향이든 더했을 때 합계가 같은 2차원 정사각 배열을 말합니다.
		 * 만드는 규칙은 다음과 같습니다.
			[1] 가로의 크기와 세로의 크기는 무조건 같아야 합니다.
			[2] 1은 반드시 첫줄 가운데 위치합니다.
			[3] 2부터는 이전 숫자의 오른쪽 윗 칸에 위치합니다.
			[4] 만약 배열을 오른쪽으로 벗어나게 되는 경우 같은줄의 왼쪽 처음으로 이동하여 진행합니다.
			[5] 만약 배열을 상단으로 벗어나게 되는 경우 같은칸의 맨 아래로 이동하여 진행합니다.
			[6] 만약 오른쪽 윗 칸이 비어있지 않을 경우 이동하지 않고 아래칸으로 이동합니다.
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("***원하는 마방진 크기를 입력하세요.(홀수만 가능)***");
		System.out.print("마방진 크기 입력 : ");
		int size = s.nextInt();
		
		s.close();
		
		int[][] map = new int[size][size];
		int x=0;
		int y=size/2;
		
		for(int i=1; i<=size*size; i++) {
			map[x][y] = i; // 1은 반드시 첫줄 가운데 위치
			int tx = x-1; // 윗 칸
			int ty = y+1; // 오른쪽 칸
			
			// 만약 배열을 오른쪽으로 벗어나게 되는 경우 같은줄의 왼쪽 처음으로 이동하여 진행
			if(ty==size) {
				ty=0;
			}
			// 만약 배열을 상단으로 벗어나게 되는 경우 같은칸의 맨 아래로 이동하여 진행
			if(tx==-1) {
				tx=size-1;
			}
			// 만약 오른쪽 윗 칸이 비어있지 않을 경우 이동하지 않고 아래칸으로 이동
			if(map[tx][ty]==0) {
				x=tx;
				y=ty;
			}
			else {
				x++;
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(map[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
