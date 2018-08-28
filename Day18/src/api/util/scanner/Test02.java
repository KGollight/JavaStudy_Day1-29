package api.util.scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		Scanner 응용 - 구분자
		
//		String color = "빨강/주황/노랑/초록/파랑/남색/보라";
		String color = "빨강/주황-노랑+초록=파랑?남색~보라";
		
		Scanner s = new Scanner(color);
//		구분자(delimiter) 설정
//		s.useDelimiter("/");
		s.useDelimiter("[/+=?~-]");
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
	}

}
