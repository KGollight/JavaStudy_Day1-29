package api.util.scanner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) throws IOException {
//		웹페이지 읽어오기
		URL url = new URL("http://mnet.com/");
		Scanner s = new Scanner(url.openStream(),"UTF-8");
		
		StringBuffer sb = new StringBuffer();
		while(s.hasNextLine()) {
			String line = s.nextLine();
//			System.out.println(line);
			sb.append(line);
		}
		s.close();
		
		String page = sb.toString();
		System.out.println(page);
	}

}
