package oop.method2;

public class Quiz01 {

	public static void main(String[] args) {
		/* 1회성 메소드를 구현 후 이용
		 * [1] 제곱을 구하는 메소드
		 * [2] x의 y제곱을 구하는 메소드
		 * [3] 삼각형 넓이를 구하는 메소드
		 * [4] 원의 넓이를 구하는메소드
		 * [5] 원하는 범위의 랜덤 정수값을 반환하는 메소드
		 * */
		Utility util = new Utility();
		
		int num1 = util.mul(3);
		long num2 = util.mulx(2, 10);
		double num3 = util.triangle(5, 3);
		double num4 = util.circle(5);
		int num5 = util.random(1, 5);
		
		System.out.println("[1] : "+num1);
		System.out.println("[2] : "+num2);
		System.out.println("[3] : "+num3);
		System.out.println("[4] : "+num4);
		System.out.println("[5] : "+num5);
	}

}
