package api.lang.string;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		String[] dbId = new String[] {"kgitbank", "teacher", "student"};
		String[] dbPw = new String[] {"master", "java", "java"};
		
		Scanner s = new Scanner(System.in);
		System.out.println("***아이디와 비밀번호를 입력하세요***");
		System.out.print("ID : ");
		String id = s.next();
		System.out.print("PW : ");
		String pw = s.next();
		
		s.close();
		
		int count=0;
		for(int i=0; i<id.length(); i++) {
			if(id.equals(dbId[i]) && pw.equals(dbPw[i])) {
				count++;
				break;
			}
		}
		
		if(count>0)
			System.out.println("로그인 성공!");
		else
			System.out.println("로그인 실패...");
		
//		if(id.equals("kgitbank") && pw.equals("master")) {
//			System.out.println("로그인 성공!");
//		}
//		else if(id.equals("teacher") && pw.equals("java")) {
//			System.out.println("로그인 성공!");
//		}
//		else if(id.equals("student") && pw.equals("java"))
//			System.out.println("로그인 성공!");
//		else
//			System.out.println("로그인 실패...");
	}

}
