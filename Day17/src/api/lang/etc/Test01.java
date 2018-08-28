package api.lang.etc;

import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		//Runtime클래스	싱글톤방식의 클래스
		//				운영체제에 각종 지시를 내릴 수 있다.
		
//		Runtime r = new Runtime();	-> 에러
		Runtime r = Runtime.getRuntime();
		
		try {
			r.exec("notepad");//메모장
			r.exec("cmd /c start http://www.google.com");
		} catch (Exception e) {
			System.out.println("전송 오류");
			e.printStackTrace();
		}
	}

}
