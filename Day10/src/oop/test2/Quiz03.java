package oop.test2;

public class Quiz03 {

	public static void main(String[] args) {
		// ,������ ����
		Sport bb = new Sport();
		Sport sc = new Sport();
		Sport bk = new Sport();
		Sport mt = new Sport();
		
		bb.insert("�߱�", "��������", 9);
		sc.insert("�౸", "��������", 11);
		bk.insert("��", "��������", 5);
		mt.insert("������", "��������", 1);
		
		bb.print();
		sc.print();
		bk.print();
		mt.print();
	}

}
