package oop.test5;

public class Menu {
	// 변수
	String name;
	int price;
	
	// 메소드
	
	// 1개만 설정하는 메소드 => setter 메소드
	void setName(String name) {
		this.name = name;
	}
	
	void setPrice(int price) {
		if(price>=0)
			this.price = price;
	}
	
	// 전체를 설정하는 메소드
	void insert(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
}
