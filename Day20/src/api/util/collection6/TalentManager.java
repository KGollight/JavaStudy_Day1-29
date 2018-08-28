package api.util.collection6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TalentManager {
	
//	���� : ����� / ��ĳ��
	private Map<Company, List<Talent>> db = new HashMap<>();
	private Scanner s  = new Scanner(System.in);
	
//	�޴� ǥ��
	public void menu() {
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
	}
	
//	���� �Է�
	public int numberInput(String message) {
		System.out.print(message);
		int choice = s.nextInt();
		s.nextLine();
		return choice;
	}
	
//	���ڿ� �Է�
	public String stringInput(String message) {
		System.out.print(message);
		String line = s.nextLine();
		return line;
	}
	
//	1�� �޴�(�Ҽӻ� ���)
	public void addCompany(Company company) {
		if(db.containsKey(company)) {
			System.out.println("�̹� ��ϵǾ� �ִ� �Ҽӻ� �̸��Դϴ�.");
		}
		else {
			db.put(company, new ArrayList<>());
			System.out.println("�Ҽӻ� ����� �Ϸ�Ǿ����ϴ�.");
		}
	}
//	2�� �޴�(�Ҽӻ� ����)
	public void removeCompany(Company company) {
		if(db.containsKey(company)) {
			db.remove(company);
			System.out.println("�Ҽӻ� ������ �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
		}
	}
//	3�� �޴�(������ ���)
	public void addTalent(Company company, Talent talent) {
		if(db.containsKey(company)) {
			List<Talent> list = db.get(company);
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
//	4�� �޴�(������ ����)
	public void removeTalent(Company company, Talent talent) {
		if(db.containsKey(company)) {
			List<Talent> list = db.get(company);
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
//	5�� �޴�(��ü ������ ���)
	public void listAll() {
		if(db.size() > 0) {
			System.out.println("### ��ü ������ ��� ���� ###");
//			for(Map.Entry<Company, List<Talent>> entry : db.entrySet()) {
//				Company company = entry.getKey();
			for(Company company : db.keySet()) {
				this.list(company);
			}
		}
		else {
			System.out.println("��ϵ� ������ �����ϴ�");
		}
	}
	
//	6�� �޴�(�Ҽӻ� ������ ���)
	public void list(Company company) {
		if(db.containsKey(company)) {
			List<Talent> list = db.get(company);
			System.out.println("["+company.getName()+"] "
												+ "�Ҽ� ������ ���("+list.size()+"��)");
			for(Talent talent : list) {
				System.out.println("�� "+talent.getName());
			}
		}
		else {
			System.out.println("��ϵ��� ���� �Ҽӻ� �̸��Դϴ�.");
		}
	}
	
//	0�� �޴�(����)
	public void exit() {
		s.close();
		System.exit(0);
	}
	
//	�޴��� ó��
	public void process(int choice) {
		//�Ҽӻ� ���
		if(choice == 1) {
			String company = this.stringInput("�Ҽӻ� �̸� : ");
			this.addCompany(new Company(company));
		}
		//�Ҽӻ� ����
		else if(choice == 2) {
			String company = this.stringInput("�Ҽӻ� �̸� : ");
			this.removeCompany(new Company(company));
		}
		//������ ���
		else if(choice == 3) {
			String company = this.stringInput("�Ҽӻ� �̸� : ");
			String talent = this.stringInput("������ �̸� : ");
			this.addTalent(new Company(company), new Talent(talent));
		}
		//������ ����
		else if(choice == 4) {
			String company = this.stringInput("�Ҽӻ� �̸� : ");
			String talent = this.stringInput("������ �̸� : ");
			this.removeTalent(new Company(company), new Talent(talent));
		}
		//��ü ������ ��� ���
		else if(choice == 5) {
			this.listAll();
		}
		//�Ҽӻ� ������ ��� ���
		else if(choice == 6) {
			String company = this.stringInput("�Ҽӻ� �̸� : ");
			this.list(new Company(company));
		}
		//����
		else if(choice == 0) {
			this.exit();
		}
		//�߸��� �Է�
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
	
	public void work() {
		while(true) {
//			�޴� ���
			this.menu();
			int choice = this.numberInput("���� : ");
			
			System.out.println();
			
			this.process(choice);
		}
	}
	
}











