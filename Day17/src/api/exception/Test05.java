package api.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//Scanner처럼 반드시 close가 되어야 하는 것들은 예외 발생 여부와 관계없이 처리될 수 있도록 구성해야 한다.
		//finally	-> 필수는 아니지만 작성할 경우 try구문이 종료되면 무조건 실행됨
		//			-> 사용한 자원들을정리하는 코드를 사용

		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.println("선물 개수와 나눠줄 사람수를 입력");
			int a = s.nextInt();
			int b = s.nextInt();
			
			//강제 예외 발생 : 컴퓨터가 모르는 상황에서는 throw를 통해 catch로 이동
			if(a<0||b<0) {
				throw new Exception();
			}
			
			System.out.println("한사람당 줄 수 있는 선물 수 : "+a/b);
		}
		catch(Exception e) {
			e.printStackTrace();//개발용
		}
		finally {
			System.out.println("스캐너를 종료합니다.");
			s.close();
		}
	}

}
