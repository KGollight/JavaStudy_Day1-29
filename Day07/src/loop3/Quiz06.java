package loop3;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 사용자에게 입력받은 숫자가 7을 몇개 가지고 있냐
		Scanner s = new Scanner(System.in);
		System.out.println("***숫자를 입력하세요***");
		int num = s.nextInt();
		int cla = 0;
		int seven = 0;
		
		for(int j=num; j>0; j/=10) {
			if(j%10==7) {
				seven++;
			}
		}
		System.out.println("7의 개수 : "+seven);
		
		s.close();
		
		//if()
		// 1~1000사이의 숫자를 검사하여 7이 몇 개 있는지 구하여 화면에 출력
		int start = 1;
		int finish = 1000;
		int check = 7;
		int count=0;
		/*for(int i=start; i<=finish; i++) {
			int a=i/100;
			int b=i%100/10;
			int c=i%10;
			
			if(a==7) {
				count++;
			}
			if(b==7) {
				count++;
			}
			if(c==7) {
				count++;
			}
		}*/
		for(int i=start; i<=finish; i++) {
			for(int k=i; k>0; k/=10) {
				if(i%10==check) {
					count++;
				}
			}
		}
		System.out.println("1~1000사이의 7갯수 : "+count);
	}

}
