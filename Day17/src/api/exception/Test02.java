package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//발생하는 두 종류의 예외를 try~catch 구문으로 해결
		//try		-> 감시할 지역
		//catch		-> 문제 발생 시 강제 이동할 지역
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("나눗셈할 숫자를 입력");
			int a = s.nextInt();
			int b = s.nextInt();
			
			s.close();
			
			System.out.println("결과 : "+a/b);
		}
		catch(InputMismatchException e) {
			//빨간 메시지 대신 할 일을 작성
			System.out.println("숫자 입력 잘하자");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 되겠냐");
		}
	}

}
