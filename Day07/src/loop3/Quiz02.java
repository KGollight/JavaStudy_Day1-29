package loop3;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("***시간을 입력하세요***");
		System.out.print("분 : ");
		int min = s.nextInt();
		System.out.print(" 초 : ");
		int second = s.nextInt();
		System.out.print("\n");
		
		s.close();
		
		int time = min*60+second;
		
		for(int i=time; i>0; i--) {
			System.out.println(i/60+"분 "+i%60+"초 후에 알람이 울립니다...");
			
			// 1초 정지 코드(1000밀리초)
			Thread.sleep(1000L);
		}
		System.out.println("시간이 다 되었습니다!");
	}

}
