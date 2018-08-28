package oop.inherit6;

public class Phone {
	//������ ���� �� ����� ����Ͽ� ���������� �����ؾ� ��
	// private		=> �ڽĵ� ������ �Ұ���(����)
	// protected	=> �ڽĸ� ���� ����
	private String name;
	private String telecom;
	private int price;
	
	//setter & getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTelecom(String telecom) {
		switch(telecom) {
		case "LG":		case "lg":
		case "SK":		case "sk":
		case "KT":		case "kt":
		case "�˶���":
			this.telecom = telecom;
		}
	}
	public String getTelecom() {
		return telecom;
	}
	public void setPrice(int price) {
		if(price < 0) return;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//������
	public Phone(String name, String telecom, int price){
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
	}
	
	public void print() {
		System.out.println("## �޴��� ���� ##");
		System.out.println("�̸� : "+name);
		System.out.println("��Ż� : "+telecom);
		System.out.println("���� : "+price);
		System.out.println("�����Ⱓ : "+price);
		System.out.println("����ī�� : "+price);
	}
}















