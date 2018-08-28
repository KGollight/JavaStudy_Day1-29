package api.util.collection5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
//		����� ����
		Map<String, List<String>> db = new HashMap<>();
		
//		�Էµ��� ����
		Scanner s = new Scanner(System.in);
		
		while(true) {
//			�޴� ���
			System.out.println();
			System.out.println("��[ ������ ��ȸ ���� ���α׷� ]��");
			System.out.println("1. �Ҽӻ� ���");
			System.out.println("2. �Ҽӻ� ����");
			System.out.println("3. ������ ���");
			System.out.println("4. ������ ����");
			System.out.println("5. ��ü ������ ��� ���");
			System.out.println("6. �Ҽӻ纰 ������ ��� ���");
			System.out.println("0. ���α׷� ����");
			
			System.out.println("������������������������������");
			System.out.print("���� : ");
			int choice = s.nextInt();
			s.nextLine();
			
			System.out.println();
			
			//�Ҽӻ� ���
			if(choice == 1) {
				System.out.print("�Ҽӻ� �̸� : ");
				String company = s.nextLine();
				if(db.containsKey(company)) {
					System.out.println("�̹� ��ϵǾ� �ִ� �Ҽӻ� �̸��Դϴ�.");
				}
				else {
					db.put(company, new ArrayList<>());
					System.out.println("�Ҽӻ� ����� �Ϸ�Ǿ����ϴ�.");
				}
			}
			//�Ҽӻ� ����
			else if(choice == 2) {
				System.out.print("�Ҽӻ� �̸� : ");
				String company = s.nextLine();
				if(db.containsKey(company)) {
					db.remove(company);
					System.out.println("�Ҽӻ� ������ �Ϸ�Ǿ����ϴ�.");
				}
				else {
					System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
				}
			}
			//������ ���
			else if(choice == 3) {
				System.out.print("�Ҽӻ� �̸� : ");
				String company = s.nextLine();
				System.out.print("������ �̸� : ");
				String talent = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					if(list.contains(talent)) {
						System.out.println("�̹� ��ϵǾ� �ִ� ������ �̸��Դϴ�.");
					}
					else {
						list.add(talent);
						System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");
					}
				}
				else {
					System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
				}
				
			}
			//������ ����
			else if(choice == 4) {
				System.out.print("�Ҽӻ� �̸� : ");
				String company = s.nextLine();
				System.out.print("������ �̸� : ");
				String talent = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					if(list.contains(talent)) {
						list.remove(talent);
						System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
					}
					else {
						System.out.println("��ϵ��� ���� ������ �̸��Դϴ�.");
					}
				}
				else {
					System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
				}
			}
			//��ü ������ ��� ���
			else if(choice == 5) {
				if(db.size() > 0) {
					System.out.println("### ��ü ������ ��� ���� ###");
					for(Map.Entry<String, List<String>> entry : db.entrySet()) {
						String company = entry.getKey();
						List<String> list = entry.getValue();
						
						System.out.println("["+company+"] �Ҽ� ������ ���("+list.size()+"��)");
						for(String name : list) {
							System.out.println("�� "+name);
						}
					}
				}
				else {
					System.out.println("��ϵ� ������ �����ϴ�");
				}
			}
			//�Ҽӻ� ������ ��� ���
			else if(choice == 6) {
				System.out.print("�Ҽӻ� �̸� : ");
				String company = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					System.out.println("["+company+"] �Ҽ� ������ ���("+list.size()+"��)");
					for(String name : list) {
						System.out.println("�� "+name);
					}
				}
				else {
					System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
				}
			}
			//����
			else if(choice == 0) {
				System.out.println("���α׷��� �����մϴ�");
				s.close();
				System.exit(0);
			}
			//�߸��� �Է�
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}
	}
}
