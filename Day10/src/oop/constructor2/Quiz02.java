package oop.constructor2;

public class Quiz02 {

	public static void main(String[] args) {
		// ������ ���ӱ� �����
		GamingGear gun = new GamingGear("�ǹ���", 300);
		GamingGear drum = new GamingGear("�巳�ŴϾ�", 500);
		GamingGear pist = new GamingGear("ö��7", 1000);
		
		gun.play(3);
		drum.play(2);
		pist.play(5);
		
		gun.print();
		drum.print();
		pist.print();
	}

}
