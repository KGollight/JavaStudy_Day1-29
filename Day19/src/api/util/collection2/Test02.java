package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		List<Talent> list = new ArrayList<>();
		
		list.add(new Talent("������"));
		list.add(new Talent("���̸�"));
		list.add(new Talent("���ٴϿ�"));
		list.add(new Talent("����"));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("***��ǥ��� �Է�***");
			String name = s.nextLine();
			
			if(name.equals("����"))
				break;
			
			Talent target = null;
			for(int i=0; i<list.size(); i++) {
				Talent t = list.get(i);
				if(t.getName().equals(name)) {
//					t.setVote(t.getVote()+1);
//					t.vote();
					target = t;
				}
			}
			
//			target�� ������ ���� �˻� ���θ� ����
			if(target==null) {
				System.out.println("�׷� �ĺ� �����ϴ�.");
			}
			else {
				target.vote();
				System.out.println("��ǥ�� �Ϸ�Ǿ����ϴ�. ���� ��"+target.getTotal()+"ǥ �߿� "+target.getVote()+"ǥ");
			}
				
		}
		
		s.close();
		
//		��� 
		for(int i=0; i<list.size(); i++) {
			Talent t = list.get(i);
			t.print();
		}
	}

}
