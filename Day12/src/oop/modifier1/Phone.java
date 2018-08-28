package oop.modifier1;

public class Phone {
	private String name;
	private String company;
	private int price;
	
	Phone(String name, String company, int price){
		this.setName(name);
		this.setCompany(company);
		this.setPrice(price);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setCompany(String company) {
		switch(company) {
		case "LG":	case "lg":
		case "SK":	case "sk":
		case "KT":	case "kt":
		case "�˶���":
			this.company = company;
		}
	}
	
	void setPrice(int price) {
		if(price<0)
			return;
		else
			this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	String getCompany() {
		return company;
	}
	
	int getPrice() {
		return price;
	}
	
	void print() {
		System.out.println("���� : "+this.getName());
		System.out.println("��Ż� : "+this.getCompany());
		System.out.println("���� : "+this.getPrice());
		System.out.println();
	}
}
