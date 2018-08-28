package oop.constructor2;

public class Quiz02 {

	public static void main(String[] args) {
		// 오락실 게임기 만들기
		GamingGear gun = new GamingGear("건버드", 300);
		GamingGear drum = new GamingGear("드럼매니아", 500);
		GamingGear pist = new GamingGear("철권7", 1000);
		
		gun.play(3);
		drum.play(2);
		pist.play(5);
		
		gun.print();
		drum.print();
		pist.print();
	}

}
