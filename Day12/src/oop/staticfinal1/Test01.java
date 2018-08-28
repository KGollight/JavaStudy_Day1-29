package oop.staticfinal1;

public class Test01 {

	public static void main(String[] args) {
		// 가위바위보 게임
		// 가위(0), 바위(1), 보(2)
		int com = (int)(Math.random()*3);
		
		switch(com) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
	}

}
