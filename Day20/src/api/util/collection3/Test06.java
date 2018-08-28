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
			System.out.println("<��ǰ �̸��� �Է��ϼ���>");
			String name = s.nextLine();
			
			if(name=="����")
				break;

			System.out.println("<��ǰ ������ �Է��ϼ���>");
			int price = s.nextInt();
			s.nextLine();
			
			Goods p = new Goods(name, price);
			
			if(db.add(p)) {
				System.out.println("��ǰ ����� �Ϸ�Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ��ϵ� ��ǰ���Դϴ�");
			}
		}
		s.close();
		
		System.out.println("���α׷��� �����մϴ�.");

//		��� ���
		Iterator<Goods> it = db.iterator();
		while(it.hasNext()) {
			Goods p = it.next();
			System.out.println(p);
		}
	}

}
