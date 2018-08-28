package oop.static1;

// 소나타 클래스 = 제조사 + 색상 + 가격 + 최고속도 + ...
public class Sonata {
	String company;
	String color;
	int price;
	int maxSpeed;
	
	Sonata(String color, int price){
		this.company = "현대";
		this.color = color;
		this.price = price;
		this.maxSpeed = 250;
	}
	
	void print() {
		System.out.println("## 소나타 정보 ##");
		System.out.println("제조사 : "+this.company);
		System.out.println("색상 : "+this.color);
		System.out.println("가격 : "+this.price+"원");
		System.out.println("최고속도 : "+this.maxSpeed+"km");
	}
}
