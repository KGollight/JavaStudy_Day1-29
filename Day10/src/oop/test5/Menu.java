package oop.test5;

public class Menu {
	// ����
	String name;
	int price;
	
	// �޼ҵ�
	
	// 1���� �����ϴ� �޼ҵ� => setter �޼ҵ�
	void setName(String name) {
		this.name = name;
	}
	
	void setPrice(int price) {
		if(price>=0)
			this.price = price;
	}
	
	// ��ü�� �����ϴ� �޼ҵ�
	void insert(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
}
