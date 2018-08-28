package api.exception;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//close()가 꼭 필요하다면 자동 close()를 수행하는 try~catch를 사용
		// -> 항상 사용하는게 아니라 close()가 필요한 경우에만 사용
		// -> try()안에 선언한 인스턴스는 try종료 시 자동으로 close()를 수행

		
		
		try(Scanner s = new Scanner(System.in);) {
			
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
	}

}
