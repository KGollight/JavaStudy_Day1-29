package api.lang.wrapper;

public class Test02 {

	public static void main(String[] args) {
		// 참조형을 사용하면 좋은 경우 - 정수를 2진수로 변환하여 출력
		
		// 원시형
		int a=10;	// -----> (2진수) 1010
		
		String b="";
		
		for(int i=a; i>0; i/=2) {
			b=i%2+b;
		}
		System.out.println("b = "+b);
		
		// 참조형
		System.out.println(Integer.toBinaryString(a));
	}

}
