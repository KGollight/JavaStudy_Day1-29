package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String 생성
		String a = "hello";
		String b = "hello";
		
		String c = new String("hello");
		String d = new String("hello");
		
		//a와 b는 동일, c와 d는 동등
		System.out.println(a==b);	//true
		System.out.println(c==d);	//false
		System.out.println(c.equals(d));	//true(주로 사용)
		
		String e = "Hello";
		System.out.println(a.equals(e));	//false(대소문자 구분함)
		System.out.println(a.equalsIgnoreCase(e));	//true(대소문자 무시)
	}

}
