package api.lang.string;

public class Test05 {

	public static void main(String[] args) {
		//다른 자료형들을 문자열로 변환 or 다시 되돌리기
		int a = 10;
//		String b = a;
		String b = ""+a;
		String c = String.valueOf(a);
		
		System.out.println(b);
		System.out.println(c);
	}

}
