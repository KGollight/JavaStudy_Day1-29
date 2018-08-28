package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) throws FileNotFoundException {
		//사용자에게 아이디 및 비밀번호를 입력받는 코드
		Scanner keyboard = new Scanner(System.in);
		System.out.println("아이디 / 비밀번호 입력");
		String id = keyboard.nextLine();
		String pw = keyboard.nextLine();
		keyboard.close();
		
		//파일을 열어 정보를 읽어오는 코드
		File file = new File("member.db");
		Scanner s = new Scanner(file);

		boolean loginFlag = false;
		while(s.hasNextLine()) {
			String line = s.nextLine();
//			System.out.println("line = "+line);
			String[] data = line.split("/");
//			data[0] : ID , data[1] : password
			
			if(id.equals(data[0]) && pw.equals(data[1])) {
				loginFlag = true;
				break;
			}
			
		}
		
		s.close();
		
		//판정 결과 출력
		System.out.println("결과 : "+loginFlag);
		if(loginFlag) {
			System.out.println(id+"님이 로그인 하셨습니다");
		}
		else {
			System.out.println("아이디 또는 비밀번호가 맞지 않습니다");
		}
	}
}
