package oop.method3;

public class Quiz01 {

	public static void main(String[] args) {
		Utiliy01 util = new Utiliy01();
		
		int num = util.bigNum(3, 5);
		System.out.println("큰 숫자 : "+num);
		
		boolean alpha = util.isAlphabet('a');
		System.out.println("알파벳 판정 : "+alpha);
		
		if(util.isAlphabet('a'))
			System.out.println("알파벳입니다.");
		else
			System.out.println("알파벳이 아닙니다.");
		
		boolean word = util.engWord("hello");
		System.out.println("영어단어 판정 : "+word);
	}

}
