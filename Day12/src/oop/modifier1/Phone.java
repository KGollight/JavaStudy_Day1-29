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
		case "알뜰폰":
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
		System.out.println("기종 : "+this.getName());
		System.out.println("통신사 : "+this.getCompany());
		System.out.println("가격 : "+this.getPrice());
		System.out.println();
	}
}
