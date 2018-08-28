package oop.staticfinal1;

public class Test03 {

	public static void main(String[] args) {
		// 가위바위보 게임
		int com = (int)(Math.random()*3);
		
		switch(com) {
		case RSP.가위:	// 원래는 'Test02.가위'이지만 같은 클래스이므로 생략함
			System.out.println("가위");
			break;
		case RSP.바위:
			System.out.println("바위");
			break;
		case RSP.보:
			System.out.println("보");
			break;
		}
	}

}
