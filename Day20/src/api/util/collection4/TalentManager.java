package api.util.collection4;

public class TalentManager {
	private String company;		//�Ҽӻ� �̸�
	private String name;		//������ �̸�
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void menu() {
		System.out.println("--[ ������ �Ŵ�����Ʈ ���α׷� ]--");
		System.out.println("1. �Ҽӻ� ���");
		System.out.println("2. �Ҽӻ� ����");
		System.out.println("3. ������ ���");
		System.out.println("4. ������ ����");
		System.out.println("5. ��ü ������ ��� ���");
		System.out.println("6. �Ҽӻ纰 ������ ��� ���");
		System.out.println("0. ����");
	}
}
