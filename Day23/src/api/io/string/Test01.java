package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		문자열 입출력을 위해 알아야 할 내용
//		 -> 문자열은 바이트와 호환이 된다.
		
		String a = "안녕 hello";
		
		byte[] b = a.getBytes(/*"MS949"*/);
		byte[] c = a.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		String d = new String(b, "MS949");
		String e = new String(c, "UTF-8");
		System.out.println("d = "+d);
		System.out.println("e = "+e);
	}

}
