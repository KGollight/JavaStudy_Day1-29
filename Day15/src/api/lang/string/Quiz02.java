package api.lang.string;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = "";
		int count=0;
		
		while(true) {
			System.out.print("아이디 입력 : ");
			id=s.next();
			
			for(int i=0; i<id.length(); i++) {
				if(id.charAt(i)>='가' && id.charAt(i)<='힣') {
					System.out.println("잘못된 아이디입니다.");
					count++;
				}
			}
			
			boolean korean = count == id.length();
			boolean idLength = id.length()<2 && id.length()>6;
			boolean admin = id.contains("운영자");
			
			if(!idLength)
				System.out.println("아이디의 길이가 맞지 않습니다.");
			else if(!korean)
				System.out.println("아이디가 한글이 아닙니다.");
			else if(!admin)
				System.out.println("아이디에 운영자가 포함되어있습니다.");
			else
				break;
		}
		
		s.close();
		
		System.out.println(id.length());
		System.out.println("입력받은 아이디 : "+id);
	}

}
