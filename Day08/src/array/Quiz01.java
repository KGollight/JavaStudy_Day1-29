package array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] nation = new String[3];
		
		for(int i=0; i<nation.length; i++) {
			System.out.println("**나라이름을 입력하세요**");
			nation[i] = s.next();
		}
		
		s.close();
		
		for(int i=0; i<nation.length; i++) {
			System.out.print("<"+nation[i]+">");
		}
	}

}
