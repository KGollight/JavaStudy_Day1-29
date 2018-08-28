package api.lang.object;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// Object는 모든 데이터를 보관할 수 있다(다형성)
		Object a=10;							// int(Integer)
		Object b="hello!";						// String
		Object c = new Scanner(System.in);		// Scanner
		
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
	}

}
