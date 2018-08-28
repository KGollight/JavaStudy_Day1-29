package loop2;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int input;
		int life = 3;
		int combo = 0;
		int score = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("***구구단 게임!***");
		
		while(true) {
			int num1 = (int)(Math.random()*9)+1;
			int num2 = (int)(Math.random()*9)+1;
			int result = num1*num2;
			
			System.out.print("구구단을 외자! "+num1+" * "+num2+" = ");
			input = s.nextInt();
			
			if(input==result) {
				System.out.println("정답!");
				combo++;
				if(combo>=2) {
					score=score+10*combo;
					System.out.println(combo+"콤보! 누적 "+score+"점!");
				}
				else {
					score+=10;
					System.out.println("10점 획득");
				}
			}
			else {
				System.out.println("땡~!!! 정답은 "+result+"였습니당~");
				life--;
				combo=0;
			}
			
			if(life==0)
				break;
		}
		System.out.println("게임이 종료되었습니다.");
		System.out.println("사용자님의 점수는 "+score+"점 입니다.");
	}

}
