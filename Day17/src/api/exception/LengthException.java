package api.exception;

//직접 만드는 예외 클래스
// - 상속을 통해서 Exception의 내용을 물려받고 시작

public class LengthException extends Exception {
	
	public LengthException(String msg) {
		super(msg);
	}
}
