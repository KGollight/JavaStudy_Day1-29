package api.util.collection4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> company = new HashSet<>();
		TalentManager tm = new TalentManager();
		
		while(true) {
			tm.menu();
			System.out.print("���� : ");
			int n = s.nextInt();
			s.nextLine();
			
			if(n==0)	break;
			
			switch(n) {
			case 1://�Ҽӻ� ���
				System.out.println("<�Ҽӻ縦 �Է��ϼ���>");
				String cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("�̹� ��ϵ� �Ҽӻ��Դϴ�.");
				}
				else {
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					company.add(cname);
					break;
				}
			case 2://�Ҽӻ� ����
				System.out.println("<�Ҽӻ縦 �Է��ϼ���>");
				cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					company.remove(cname);
					break;
				}
				else {
					System.out.println("��ϵ������� �Ҽӻ��Դϴ�.");
				}
			case 3://������ ���
				System.out.println("<�Ҽӻ縦 �Է��ϼ���>");
				cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("<������ �̸��� �Է��ϼ���>");
					String tname = s.nextLine();
				}
				else {
					System.out.println("�������� �ʴ� �Ҽӻ��Դϴ�.");
					break;
				}
			case 4:
				
			case 5:
				
			case 6:
			}
			
			
			
			
			
		}
		
		
		s.close();
	}

}
