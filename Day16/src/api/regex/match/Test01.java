package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {

	public static void main(String[] args) {
		//정규표현식을 이용한 탐색
		String text = "Windows7,Windows8,Windows10,MacOSX,CentOS";
		
		String regex = "Windows\\d+";
		
		//탐색 객체를 생성
		Matcher m = Pattern.compile(regex).matcher(text);
		
		//m.find()	검색 결과가 존재하는가
		//m.group()	검색 결과를 반환
		//m.start()	시작점 위치
		//m.end()	종료점 위치
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
		}
	}

}
