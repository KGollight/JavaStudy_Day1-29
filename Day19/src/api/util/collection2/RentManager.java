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
		
//		������ �غ�
		list.add(new Car("�ҳ�Ÿ", 100000));
		list.add(new Car("�ƹݶ�", 80000));
		list.add(new Car("BMW", 150000));
		list.add(new Car("����", 130000));
	}
	
	public void list() {
		System.out.println("<���� ���>");
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
		System.out.println("�뿩�� ������ �Է�");
		String name = s.nextLine();
		
		Car target = this.find(name);
		if(target == null) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
		}
		else {
			if(target.isRent()) {
				target.setRent(false);
				System.out.println("�뿩 ó���� �Ϸ�Ǿ����ϴ�");
			}
			else {
				System.out.println("���� �뿩���� ������ �����Դϴ�");
			}
		}
	}
	
	public void back() {
		System.out.println("�ݳ��� ������ �Է�");
		String name = s.nextLine();
		
		Car target = this.find(name);
		
		if(target == null) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
		}
		else {
			if(!target.isRent()) {
				target.setRent(true);
				System.out.println("�ݳ� ó���� �Ϸ�Ǿ����ϴ�");
			}
			else {
				System.out.println("�ݳ��Ͻ� �� �����ϴ�. ���������̳� ��������?");
			}
		}
	}
	
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		s.close();
		System.exit(0);
	}
	
	public void process() {
//		��� ���
		while(true) {
			this.list();
			
			System.out.println("1.�뿩 2.�ݳ� 3.����");
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



