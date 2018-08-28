package loop2;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		int count = 0;
		int num = (int)(Math.random()*1000)+1;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			count++;
			System.out.print("정답을 입력하세요 : ");
			int input = s.nextInt();
			
			if(input>num)
				System.out.println("다운!");
			else if(input<num)
				System.out.println("업!");
			else
				break;
		}
		s.close();
		
		System.out.println("***축하합니다!!!***");
		System.out.println(count+"회만에 정답을 맞추셨습니다.");
	}

}
