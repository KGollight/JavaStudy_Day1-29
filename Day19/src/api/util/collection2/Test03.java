package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		List<RentCar> list = new ArrayList<>();
		
		//���� ���� : ����
		list.add(new RentCar("�ҳ�Ÿ", "����", 10));
		list.add(new RentCar("�ƹݶ�", "����", 8));
		list.add(new RentCar("BMW", "����", 15));
		list.add(new RentCar("����", "����", 13));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<���� ���>");
			for(int i=0; i<list.size(); i++) {
				RentCar r = list.get(i);
				r.print();
			}
			
			System.out.println("1.��Ʈ, 2.�ݳ�, 3.����");
			int n = s.nextInt();
			s.nextLine();
			
			switch(n) {
			case 1:
//				��Ʈ
				System.out.println("*�뿩�ϰ��� �ϴ� ������ �Է��ϼ���...");
				String name = s.nextLine();
				String allow = null;
				for(int i=0; i<list.size(); i++) {
					RentCar r = list.get(i);
					if(r.getName().equals(name)) {
						if(r.getAllow().equals("����")) {
							allow = "�뿩 ��";
							r.setAllow(allow);
							System.out.println(r.getName()+"�� �뿩�ϼ̽��ϴ�.");
							break;
						}
					}
					else
						System.out.println("�̹� �뿩���� �����Դϴ�.");
				}
				break;
			case 2:
//				�ݳ�
				System.out.println("*�ݳ��ϰ��� �ϴ� ������ �Է��ϼ���...");
				name = s.nextLine();
				for(int i=0; i<list.size(); i++) {
					RentCar r = list.get(i);
					if(r.getName().equals(name)) {
						if(r.getAllow().equals("�뿩 ��")) {
							allow = "����";
							r.setAllow(allow);
							System.out.println(r.getName()+"�� �ݳ��ϼ̽��ϴ�.");
							break;
						}
					}
					else
						System.out.println("�뿩���� ������ �ƴմϴ�.");
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
