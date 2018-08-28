package api.exception;

public class Robot {
	
	//나눗셈 메소드
	// - 나는 예외가 발생할 수 있는위험한 메소드다
	// - 예외가 발생할지도 모른다는 표식을 남겨서 이용하는 대상이 예외를 반드시 처리하도록 구현하겠다.
	// - throws
	public int div(int a, int b) throws Exception {
		return a/b;
	}
}
