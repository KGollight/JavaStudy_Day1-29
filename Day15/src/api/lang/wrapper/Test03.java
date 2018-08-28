package api.lang.wrapper;

public class Test03 {

	public static void main(String[] args) {
		// int와 Integer는 같은 형태로 취급하여 자유롭게 호환이 가능하다.
		// - 단, 안되는 경우는 반드시 형태를 명시할 것!
		
		// a와 b는 동일하고, c와 d는 동등하다.
		Integer a = 10;
		Integer b = 10;
		
		Integer c = new Integer(10);
		Integer d = new Integer(10);
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(a==b);	// true
		System.out.println(c==d);	// false
		
		// 동등할 경우에는 값만 비교하는 명령이 따로 존재
		System.out.println(c.equals(d));	// true
	}

}
