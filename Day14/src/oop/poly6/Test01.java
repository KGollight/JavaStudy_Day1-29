package oop.poly6;

public class Test01 {
	public static void main(String[] args) {
		// ���� ��ȯ(casting)

		Hwang a = new Hwang();
		a.teach();
		a.drink();
		a.game();
		
		// ��� : Hwang -> Teacher(��ĳ����, up-casting)
		Teacher b=a;
		b.teach();
//		b.drink();
//		b.game;
		
		// b�� ����ִ� ���� ���¸� �ľ��ϴ� ���
		System.out.println(b instanceof Hwang);	// b�� Hwang�� �ν��Ͻ��Դϱ�
		
		// ��� : Teacher -> Hwang(�ٿ�ĳ����, down-casting)
//		Hwang c = b;
		Hwang c = (Hwang)b;
		c.teach();
		c.drink();
		c.game();
		
		
	}
}
