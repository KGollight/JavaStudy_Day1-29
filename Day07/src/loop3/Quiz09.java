package loop3;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// 사용자가 구간을 입력하면 해당하는 구간에 존재하는 모든 소수 출력
		Scanner s = new Scanner(System.in);
		System.out.println("***숫자를 입력하세요***");
		System.out.println("***구간을 입력하세요***");
		System.out.print("시작 : ");
		int start = s.nextInt();
		System.out.print("\n끝 : ");
		int end = s.nextInt();
		int count2=0;
				
		s.close();
			
		for(int j=start; j<=end; j++) {
			for(int k=1; k<=j; k++) {
				if(j%k==0) {
					count2++;
				}
			}
			if(count2==2)
				System.out.println(j+"은(는) 소수입니다.");
		}
	}

}
