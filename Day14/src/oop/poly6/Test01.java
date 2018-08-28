package oop.poly6;

public class Test01 {
	public static void main(String[] args) {
		// 형태 변환(casting)

		Hwang a = new Hwang();
		a.teach();
		a.drink();
		a.game();
		
		// 출근 : Hwang -> Teacher(업캐스팅, up-casting)
		Teacher b=a;
		b.teach();
//		b.drink();
//		b.game;
		
		// b에 들어있는 실제 형태를 파악하는 방법
		System.out.println(b instanceof Hwang);	// b가 Hwang의 인스턴스입니까
		
		// 퇴근 : Teacher -> Hwang(다운캐스팅, down-casting)
//		Hwang c = b;
		Hwang c = (Hwang)b;
		c.teach();
		c.drink();
		c.game();
		
		
	}
}
