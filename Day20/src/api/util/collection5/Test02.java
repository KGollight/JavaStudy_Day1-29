package api.util.collection5;

public class Test02 {
	public static void main(String[] args) {
		
		TalentManager manager = new TalentManager();
		
		while(true) {
//			�޴� ���
			manager.menu();
			int choice = manager.numberInput("���� : ");
			
			System.out.println();
			
			//�Ҽӻ� ���
			if(choice == 1) {
				String company = manager.stringInput("�Ҽӻ� �̸� : ");
				manager.addCompany(company);
			}
			//�Ҽӻ� ����
			else if(choice == 2) {
				String company = manager.stringInput("�Ҽӻ� �̸� : ");
				manager.removeCompany(company);
			}
			//������ ���
			else if(choice == 3) {
				String company = manager.stringInput("�Ҽӻ� �̸� : ");
				String talent = manager.stringInput("������ �̸� : ");
				manager.addTalent(company, talent);
			}
			//������ ����
			else if(choice == 4) {
				String company = manager.stringInput("�Ҽӻ� �̸� : ");
				String talent = manager.stringInput("������ �̸� : ");
				manager.removeTalent(company, talent);
			}
			//��ü ������ ��� ���
			else if(choice == 5) {
				manager.listAll();
			}
			//�Ҽӻ� ������ ��� ���
			else if(choice == 6) {
				String company = manager.stringInput("�Ҽӻ� �̸� : ");
				manager.list(company);
			}
			//����
			else if(choice == 0) {
				manager.exit();
			}
			//�߸��� �Է�
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}
	}
}
