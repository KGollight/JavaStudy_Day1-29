package oop.method7;

public class Quiz01 {

	public static void main(String[] args) {
		// ����	�� / �� / �� / ���� / ���� / ����=>?
		Nations swd = new Nations("������", 2, 0, 1, 5, 2);
		Nations mex = new Nations("�߽���", 2, 0, 1, 3, 4);
		Nations kor = new Nations("���ѹα�", 1, 0, 2, 3, 3);
		Nations ger = new Nations("����", 1, 0, 2, 2, 4);
		
		swd.print();
		mex.print();
		kor.print();
		ger.print();
		
		Utility util = new Utility();
		int s = util.nationCalc(swd, mex);
		System.out.println("s = "+s);
	}

}
