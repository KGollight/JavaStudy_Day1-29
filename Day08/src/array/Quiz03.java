package array;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int[] test = new int[] {10, 55, 90, 36, 44, 77, 85, 93, 89, 70};
		int sum=0;
		int avg=0;
		int low=0;
		int grade=test.length+1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("시험 점수를 입력하세요 : ");
		int point = s.nextInt();
		
		s.close();
		
		for(int i=0; i<10; i++) {
			sum+=test[i];
			if(test[i]<70)
				low++;
			if(point>test[i])
				grade--;
		}
		avg = sum/test.length;
		System.out.println("자바 점수 합계 : "+sum);
		System.out.println("자바 점수 평균 : "+avg);
		System.out.println("미달 인원 : "+low);
		System.out.println("사용자님의 예상 등수 : "+grade);
	}
}
