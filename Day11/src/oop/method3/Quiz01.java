package oop.method3;

public class Quiz01 {

	public static void main(String[] args) {
		Utiliy01 util = new Utiliy01();
		
		int num = util.bigNum(3, 5);
		System.out.println("ū ���� : "+num);
		
		boolean alpha = util.isAlphabet('a');
		System.out.println("���ĺ� ���� : "+alpha);
		
		if(util.isAlphabet('a'))
			System.out.println("���ĺ��Դϴ�.");
		else
			System.out.println("���ĺ��� �ƴմϴ�.");
		
		boolean word = util.engWord("hello");
		System.out.println("����ܾ� ���� : "+word);
	}

}
