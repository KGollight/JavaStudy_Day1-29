package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("### 나라 이름을 입력하세요 ###");
			String nation = s.next();
			
			if(list.contains(nation)) {
				System.out.println("*** 게임 오버!!! ***");
				break;
			}
			else
				list.add(nation);
		}
		
		s.close();
		
		System.out.println("\n나라 개수 : "+list.size());
		System.out.println("목록 : "+list);
	}

}
