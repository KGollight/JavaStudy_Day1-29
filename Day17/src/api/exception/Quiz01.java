package api.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try{
				System.out.println("***닉네임을 입력하세요***");
				String nickname = s.next();

				String regex = "^[가-힣]{2,6}$";
				if(!Pattern.matches(regex, nickname))
					throw new Exception("한글 2~6자로 닉네임을 설정하세요...");
				
				if(nickname.contains("운영자"))
					throw new Exception("운영자는 포함할 수 없는 단어입니다...");
				
				break;
			}
			catch(Exception e){
				System.out.println("[오류] : "+e.getMessage());
			}
		}
		
		s.close();
	}

}
