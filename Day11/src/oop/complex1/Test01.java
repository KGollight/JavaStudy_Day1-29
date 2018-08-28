package oop.complex1;

public class Test01 {

	public static void main(String[] args) {
		// 경찰을 만들고 싶다면...
		Police p = new Police();
		
		p.name = "포돌이";
		p.grade = "경사";
		p.left = new Gun();
		p.right = new Gun();
		
		// 총의 정보를 설정하려면
		p.left.name = "권총";
		p.left.bullet = 6;
		
		p.right.name = "권총";
		p.right.bullet = 8;
	}

}
