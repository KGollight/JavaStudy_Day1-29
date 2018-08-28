package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentManager {
	
//	private List<Car> list;
//	private Scanner s;
	
	private List<Car> list = new ArrayList<>();
	private Scanner s = new Scanner(System.in);
	
	public RentManager() {
//		list = new ArrayList<>();
//		s = new Scanner(System.in);
		
//		데이터 준비
		list.add(new Car("소나타", 100000));
		list.add(new Car("아반떼", 80000));
		list.add(new Car("BMW", 150000));
		list.add(new Car("링컨", 130000));
	}
	
	public void list() {
		System.out.println("<차량 목록>");
		for(int i=0; i < list.size(); i++) {
			Car c = list.get(i);
			System.out.println(c);
		}		
	}
	
	public Car find(String name) {
		Car target = null;
		for(int i=0; i < list.size(); i++) {
			Car c = list.get(i);
			if(c.getName().equals(name)) {
				target = c;
				break;
			}
		}
		return target;
	}
	
	public void rent() {
		System.out.println("대여할 차량명 입력");
		String name = s.nextLine();
		
		Car target = this.find(name);
		if(target == null) {
			System.out.println("해당 차량은 존재하지 않습니다");
		}
		else {
			if(target.isRent()) {
				target.setRent(false);
				System.out.println("대여 처리가 완료되었습니다");
			}
			else {
				System.out.println("현재 대여중인 상태의 차량입니다");
			}
		}
	}
	
	public void back() {
		System.out.println("반납할 차량명 입력");
		String name = s.nextLine();
		
		Car target = this.find(name);
		
		if(target == null) {
			System.out.println("해당 차량은 존재하지 않습니다");
		}
		else {
			if(!target.isRent()) {
				target.setRent(true);
				System.out.println("반납 처리가 완료되었습니다");
			}
			else {
				System.out.println("반납하실 수 없습니다. 빌려간적이나 있으세요?");
			}
		}
	}
	
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		s.close();
		System.exit(0);
	}
	
	public void process() {
//		목록 출력
		while(true) {
			this.list();
			
			System.out.println("1.대여 2.반납 3.종료");
			int choice = s.nextInt();
			s.nextLine();
			
			if(choice == 1) {
				this.rent();
			}
			else if(choice == 2) {
				this.back();
			}
			else {
				this.exit();
			}
		}
	}
	
}



