package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//예외 두 종류를 통합하여 처리(공통된 부모 클래스)
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("나눗셈할 숫자를 입력");
			int a = s.nextInt();
			int b = s.nextInt();
			
			s.close();
			
			System.out.println("결과 : "+a/b);
		}
		catch(RuntimeException e) {
			System.out.println("문제가 생겼습니다.");
			//예외 정보인 e를 분석하여 종류와 원인을 파악
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			
			//stacktrace를 확인하고 싶은 경우에는
			e.printStackTrace();
		}
	}

}
