package api.exception;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//예외(Exception)		실행 중 발생하는 돌발상황
		//[1] b에 0을 입력하면 예외 발생(java.lang.ArithmeticException)
		//[2] int가 아닌 다른 값을 입력한다면 예외 발생(java.util.InputMismatchException)
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("나눗셈할 숫자를 입력");
		int a = s.nextInt();
		int b = s.nextInt();
		
		s.close();
		
		System.out.println("결과 : "+a/b);
	}

}
