package oop.static2;

// 소나타 클래스 = 제조사 + 색상 + 가격 + 최고속도 + ...
public class Sonata {
	// 일괄 관리할 데이터
	static String company = "현대";
	static int maxSpeed = 250;
	
	// 개별 관리할 데이터
	String color;
	int price;
	
	Sonata(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	void print() {
		System.out.println("## 소나타 정보 ##");
		//System.out.println("제조사 : "+this.company);
		System.out.println("제조사 : "+Sonata.company);
		System.out.println("색상 : "+this.color);
		System.out.println("가격 : "+this.price+"원");
		//System.out.println("최고속도 : "+this.maxSpeed+"km");
		System.out.println("최고속도 : "+Sonata.maxSpeed+"km");
		System.out.println();
	}
}
