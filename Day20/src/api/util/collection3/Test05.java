package api.util.collection3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Product> db = new HashSet<>();
		
		while(true) {
			System.out.println("<상품 이름을 입력하세요>");
			String name = s.nextLine();
			
			if(name=="종료")
				break;

			System.out.println("<상품 가격을 입력하세요>");
			int price = s.nextInt();
			s.nextLine();
			
//			저장소에 이름이 존재하는지 확인
			boolean find = false;
			Iterator<Product> it = db.iterator();
			while(it.hasNext()) {
				Product p = it.next();
				if(p.getName().equals(name)) {
					find = true;
					break;
				}
			}
			
			if(find) {
				System.out.println("이미 등록된 상품명입니다");
			}
			else {
				Product p = new Product(name, price);
				db.add(p);//상품 등록
				System.out.println("상품 등록이 완료되었습니다.");
			}
		}
		s.close();
		
		System.out.println("프로그램을 종료합니다.");

//		목록 출력
		Iterator<Product> it = db.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p);
		}
	}

}
