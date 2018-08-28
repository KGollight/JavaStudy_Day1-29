package api.exception;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//모든 예외는 Exception으로 처리가 가능하다.
		// - 단, Java가 모르는 예외는 우리가 강제로 처리해주어야 한다.
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("선물 개수와 나눠줄 사람수를 입력");
			int a = s.nextInt();
			int b = s.nextInt();
			
			//강제 예외 발생 : 컴퓨터가 모르는 상황에서는 throw를 통해 catch로 이동
			if(a<0||b<0) {
				throw new Exception();
			}
			
			s.close();
			
			System.out.println("한사람당 줄 수 있는 선물 수 : "+a/b);
		}
		catch(Exception e) {
			e.printStackTrace();//개발용
		}
	}

}
