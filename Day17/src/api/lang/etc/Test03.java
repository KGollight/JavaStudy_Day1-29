package api.lang.etc;

public class Test03 {

	public static void main(String[] args) {
		//Math클래스	수학 계산 관련 클래스
		
//		Math m = new Math();
		
		System.out.println(Math.random());
		
		System.out.println(Math.pow(2, 10));	//2의 10승
		System.out.println(Math.sqrt(9));		//루트 9
		
		System.out.println(Math.round(1.5));	//반올림
		System.out.println(Math.ceil(1.5));		//올림
		System.out.println(Math.floor(1.5));	//버림
		System.out.println((int)1.5);			//버림
		
		System.out.println(Math.abs(-5));		//절대값 (주로 차이를 구할 때 사용)
		
		System.out.println(Math.PI);			//원주율
		System.out.println(Math.E);				//자연지수 e
		
		int bottom = 3, height = 4;
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);
		double res = Math.sqrt(result);
		
		System.out.println(res);
	}

}
