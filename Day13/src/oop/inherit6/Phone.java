package oop.inherit6;

public class Phone {
	//변수를 만들 때 상속을 고려하여 접근제한을 설정해야 함
	// private		=> 자식도 접근이 불가능(나만)
	// protected	=> 자식만 접근 가능
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
		case "알뜰폰":
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
	
	//생성자
	public Phone(String name, String telecom, int price){
		this.setName(name);
		this.setTelecom(telecom);
		this.setPrice(price);
	}
	
	public void print() {
		System.out.println("## 휴대폰 정보 ##");
		System.out.println("이름 : "+name);
		System.out.println("통신사 : "+telecom);
		System.out.println("가격 : "+price);
		System.out.println("약정기간 : "+price);
		System.out.println("제휴카드 : "+price);
	}
}















