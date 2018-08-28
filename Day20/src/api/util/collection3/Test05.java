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
			System.out.println("<��ǰ �̸��� �Է��ϼ���>");
			String name = s.nextLine();
			
			if(name=="����")
				break;

			System.out.println("<��ǰ ������ �Է��ϼ���>");
			int price = s.nextInt();
			s.nextLine();
			
//			����ҿ� �̸��� �����ϴ��� Ȯ��
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
				System.out.println("�̹� ��ϵ� ��ǰ���Դϴ�");
			}
			else {
				Product p = new Product(name, price);
				db.add(p);//��ǰ ���
				System.out.println("��ǰ ����� �Ϸ�Ǿ����ϴ�.");
			}
		}
		s.close();
		
		System.out.println("���α׷��� �����մϴ�.");

//		��� ���
		Iterator<Product> it = db.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p);
		}
	}

}
