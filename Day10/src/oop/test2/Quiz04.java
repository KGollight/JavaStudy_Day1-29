package oop.test2;

public class Quiz04 {

	public static void main(String[] args) {
		// 메뉴판
		Menu kim = new Menu();
		Menu ram = new Menu();
		Menu ameri = new Menu();
		Menu capu = new Menu();
		
		kim.insert("김밥", "식사", 3000, true);
		ram.insert("라면", "식사", 2500, false);
		ameri.insert("아메리카노", "음료", 2000, true);
		capu.insert("카푸치노", "음료", 3000, false);
		
		System.out.println("***메뉴판***");
		System.out.println("이름\t"+"종류\t"+"가격\t"+"행사상품");
		kim.print();
		ram.print();
		ameri.print();
		capu.print();
	}

}
