package api.lang.string;

public class Test02 {

	public static void main(String[] args) {
		//문자열의 검사
		
		String str = "java@itbank.com";
		System.out.println(str.length());				//글자 수 검사
		System.out.println(str.endsWith(".com"));		//종료 검사
		System.out.println(str.startsWith("java"));		//시작 검사(게임 귓속말 등의 명령어 때 사용)
		System.out.println(str.contains("itbank"));		//포함 검사
		System.out.println(str.indexOf("itbank"));		//포함 위치 검사
		
		System.out.println(str.charAt(0));				//해당 위치 글자 추출
	}

}
