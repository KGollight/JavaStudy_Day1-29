package oop.poly4;

public class Quiz01 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*2);
		int b = (int)(Math.random()*2);
		
		// 통합하기 위한 상위 형태의 변수 선언
		Unit unit;
		
		if(a==0) {
			unit = new Zealot();
		}
		else {
			unit = new Dragoon();
		}
		
		// unit에 뭐가 있을지는 모르겠지만 해당 인스턴스의 공통 기능 실행
		System.out.println("unit = "+unit);
		if(b==0)
			unit.move();
		else
			unit.attack();
	}

}
