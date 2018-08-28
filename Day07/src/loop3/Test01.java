package loop3;

public class Test01 {

	public static void main(String[] args) {
		// for 선언, 조건, 증감을 할 수 있는 자리가 있는 반복문
		// [1] while문을 이용하여 10회 반복
		//		- 자리를 지키지 않아도 에러가 나지 않음
		//		- 반복수가 계속 유지됨
		int n = 1;
		while(n<=10) {
			System.out.println("n = "+n);
			n++;
		}
		
		// [2] for문을 이용하여 10회 반복
		// for(1:2:3) { 코드 }
		// - 횟수 반복 또는 구간 반복에 특화됨
		for(int i=1; i<=10; i++) {
			System.out.println("i = "+i);
		}
	}

}
