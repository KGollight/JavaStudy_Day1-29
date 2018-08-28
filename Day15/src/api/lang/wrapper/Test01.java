package api.lang.wrapper;

public class Test01 {

	public static void main(String[] args) {
		// int(원시형) - 값을 이용하여 단순 계산을 간편하고 빠르게 처리한다.
		// 			 - 복잡한 계산은 힘들다.
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		// Integer(참조형) - 다양한 내장 기능들을 통해 복잡한 연산을 쉽게 처리한다.
		// 				 - 단순 계산은 오히려 힘들다.
		Integer d = new Integer(10);
		Integer e = new Integer(20);
		Integer f = Integer.sum(d, e);
		System.out.println(f);
	}

}
