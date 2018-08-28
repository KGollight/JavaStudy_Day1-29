package api.lang.stringbuffer;

public class Test01 {

	public static void main(String[] args) {
		//문자열 합성
		// - 문자열에 +를 사용하면편하긴 하지마 '매우 느림'
		// - 원인 : String의 특징 때문
		String str = "";	//empty string
		
		for(int i=0; i<10000; i++) {
			str += "hello"+i+"~!\n";
		}
		
		System.out.println(str);
	}

}
