package oop.inherit6;

public class Quiz01 {

	public static void main(String[] args) {
		PhoneEx p1 = new PhoneEx("아이폰X", "SK", 1000000, 24, "국민카드");
		PhoneEx p2 = new PhoneEx("갤럭시9", "KT", 1050000, 24, "삼성카드");
		PhoneEx p3 = new PhoneEx("G7", "LG", 1020000, 36, "신한카드");
		
		p1.print();
		p2.print();
		p3.print();
	}

}
