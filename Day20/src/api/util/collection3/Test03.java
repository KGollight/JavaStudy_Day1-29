package api.util.collection3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<글 번호를 입력하세요> 종료 키 : 0");
			int num = s.nextInt();
			
			if(num==0)
				break;
			
//			if(set.contains(num))
//				System.out.println(num+"번은 이미 읽은 글이어서 조회수가 증가하지 않습니다.");
//			
//			else {
//				System.out.println(num+"번 글의 조회수가 1 증가합니다.");
//				set.add(num);
//			}
			
//			판정 : set은 add 자체가 필터링이 되므로 결과를 가지고 후속처리가 가능
			if(set.add(num))
				System.out.println(num+"번 글의 조회수가 1 증가합니다.");
			
			else 
				System.out.println(num+"번은 이미 읽은 글이어서 조회수가 증가하지 않습니다.");
		}
		
		s.close();
		
		System.out.println("프로그램을 종료합니다.");
	}

}
