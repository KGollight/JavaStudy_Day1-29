package api.util.scanner;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		Scanner 클래스	입력 도구
//						표준입력통로, 문자열, 파일, 홈페이지
		
//		.next()			단어를 입력받는 명령
//		.hasNext()		남아있는 단어가 존재하는지 확인하는 명령
//		.nextLine()		문장(줄)을 입력받는 명령
//		.hasNextLine()	남아있는 문장이 존재하는지 확인하는 명령
		
		String str = "난 핸들이 고장난 8톤 트럭\n내인생은 언제나 삐딱선";
		System.out.println(str);
		
		Scanner s1 = new Scanner(str);
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		s1.close();
		
		Scanner s2 = new Scanner(str);
		while(s2.hasNextLine()) {
			System.out.println(s2.nextLine());
		}
		s2.close();
	}

}
