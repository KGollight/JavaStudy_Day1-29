package loop3;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/* String이라는 자료형은 참조형 자료형으로서 다음과 같은 명령 2가지가 내장되어 있습니다.
		 * .length()	문자 개수를 반환
		 * .charAt(i)	i번째 글자를 char로 반환
		 * 사용자에게 문자열을 한 개 입력받아 한글로만 이루어져 있는지를 판정하여 출력하세요
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력하세요...");
		String text = s.next();
		int ea = text.length();
		System.out.println("글자 수 : "+ea);
		
		s.close();
		
		char han;
		int count=0;
		
		for(int i=0; i<ea; i++) {
			han = text.charAt(i);
			if(han>='가' && han<='힣') {
				count++;
			}
		}
		if(ea==count)
			System.out.println("한글로만 이루어져있습니다.");
		else
			System.out.println("가엽고 딱한자로다...");
	}
}
