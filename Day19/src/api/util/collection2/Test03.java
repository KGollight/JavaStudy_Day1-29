package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		List<RentCar> list = new ArrayList<>();
		
		//가격 단위 : 만원
		list.add(new RentCar("소나타", "가능", 10));
		list.add(new RentCar("아반떼", "가능", 8));
		list.add(new RentCar("BMW", "가능", 15));
		list.add(new RentCar("링컨", "가능", 13));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<차량 목록>");
			for(int i=0; i<list.size(); i++) {
				RentCar r = list.get(i);
				r.print();
			}
			
			System.out.println("1.렌트, 2.반납, 3.종료");
			int n = s.nextInt();
			s.nextLine();
			
			switch(n) {
			case 1:
//				렌트
				System.out.println("*대여하고자 하는 차종을 입력하세요...");
				String name = s.nextLine();
				String allow = null;
				for(int i=0; i<list.size(); i++) {
					RentCar r = list.get(i);
					if(r.getName().equals(name)) {
						if(r.getAllow().equals("가능")) {
							allow = "대여 중";
							r.setAllow(allow);
							System.out.println(r.getName()+"를 대여하셨습니다.");
							break;
						}
					}
					else
						System.out.println("이미 대여중인 차종입니다.");
				}
				break;
			case 2:
//				반납
				System.out.println("*반납하고자 하는 차종을 입력하세요...");
				name = s.nextLine();
				for(int i=0; i<list.size(); i++) {
					RentCar r = list.get(i);
					if(r.getName().equals(name)) {
						if(r.getAllow().equals("대여 중")) {
							allow = "가능";
							r.setAllow(allow);
							System.out.println(r.getName()+"를 반납하셨습니다.");
							break;
						}
					}
					else
						System.out.println("대여중인 차종이 아닙니다.");
				}
				break;
			default:
				break;
			}
			
			if(n==3)
				break;
		}
		
		s.close();
		
		for(int i=0; i<list.size(); i++) {
			RentCar r = list.get(i);
			r.print();
		}
	}

}
