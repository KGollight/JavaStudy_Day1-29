package oop.constructor2;

public class Quiz01 {

	public static void main(String[] args) {
		// 캐릭터 만들기
		Character java = new Character("자바", "전사");
		Character python = new Character("파이썬", "마법사");
		Character spring = new Character("스프링", "도적");
		
		java.levelUp(5);
		spring.levelUp(10);
		
		java.print();
		python.print();
		spring.print();
	}

}
