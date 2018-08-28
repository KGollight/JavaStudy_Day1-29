package api.exception;

public class Test07 {

	public static void main(String[] args) {
		//원한다면 예외 클래스를 직접 만들어 사용도 가능
		// -> 자바에 기본적으로 존재하는 내용으로 표현하기 어려운 경우
		
		try {
			String id = "안녕하세요";
			
			if(id.length()<2 || id.length()>6) {
//				throw new Exception("아이디는 2~6글자로 입력하세요...");
				throw new LengthException("아이디는 2~6글자로 입력하세요...");
			}
		}
		catch(Exception e) {
			System.out.println("[오류]"+e.getMessage());
			e.printStackTrace();
		}
	}

}
