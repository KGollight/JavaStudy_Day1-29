package api.util.collection3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Goods> db = new HashSet<>();
		
		while(true) {
			System.out.println("<상품 이름을 입력하세요>");
			String name = s.nextLine();
			
			if(name=="종료")
				break;

			System.out.println("<상품 가격을 입력하세요>");
			int price = s.nextInt();
			s.nextLine();
			
			Goods p = new Goods(name, price);
			
			if(db.add(p)) {
				System.out.println("상품 등록이 완료되었습니다.");
			}
			else {
				System.out.println("이미 등록된 상품명입니다");
			}
		}
		s.close();
		
		System.out.println("프로그램을 종료합니다.");

//		목록 출력
		Iterator<Goods> it = db.iterator();
		while(it.hasNext()) {
			Goods p = it.next();
			System.out.println(p);
		}
	}

}
