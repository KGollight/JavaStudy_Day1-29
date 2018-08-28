package loop3;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// [1] 사용자에게 숫자 2개 입력받아 제곱계산하여 출력
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("숫자를 입력하세요");
		int b = s.nextInt();
		int result = a;
		
		for(int i=1; i<b; i++) {
			result*=a;
		}
		System.out.println("결과값 : "+result);
		
		// [2] 사용자에게 숫자 한개 입력받아 팩토리얼 계산 수행
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		
		s.close();
		
		if(num>=0) {
			int fact=1;
			for(int i=num; i>=1; i--) {
				System.out.println(num+"*"+(num-1));
				fact*=i;
			}
			System.out.println("결과값 : "+fact);
		}
		else
			System.out.println("음수 입력 불가");
	}

}
