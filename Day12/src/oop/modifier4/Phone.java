package oop.modifier4;

public class Phone {
	private String name;
	private String company;
	private int price;
	
	// 생성자
	public Phone(String name, String company, int price){
		this.setName(name);
		this.setCompany(company);
		this.setPrice(price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCompany(String company) {
		switch(company) {
		case "LG":	case "lg":
		case "SK":	case "sk":
		case "KT":	case "kt":
		case "알뜰폰":
			this.company = company;
		}
	}
	
	public void setPrice(int price) {
		if(price<0)
			return;
		else
			this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println("기종 : "+this.getName());
		System.out.println("통신사 : "+this.getCompany());
		System.out.println("가격 : "+this.getPrice());
		System.out.println();
	}
}
