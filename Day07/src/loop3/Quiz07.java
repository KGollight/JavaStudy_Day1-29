package loop3;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// 사용자에게 입력받은 숫자가 소수인지 판정후 출력
		Scanner s = new Scanner(System.in);
		System.out.println("***숫자를 입력하세요***");
		int num = s.nextInt();
		
		s.close();
		
		int count=0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
			if(count==2)
				break;
		}
		if(count==2)
			System.out.println(num+"은(는) 소수입니다.");
		else
			System.out.println(num+"은(는) 소수가 아닙니다.");
	}

}
