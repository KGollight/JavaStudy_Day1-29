package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		// 상세검색
		String text = "Windows7,Windows8,Windows10,MacOSX,CentOS";

//		String regex = "Windows\\d+";
		String regex = "Windows(\\d+)";

		// 탐색 객체를 생성
		Matcher m = Pattern.compile(regex).matcher(text);

		// m.find() 검색 결과가 존재하는가
		// m.group() 검색 결과를 반환
		// m.start() 시작점 위치
		// m.end() 종료점 위치
		while (m.find()) {
			System.out.println("number = " + m.group(1));
			System.out.println(m.start(1));
			System.out.println(m.end(1));
		}
	}

}
