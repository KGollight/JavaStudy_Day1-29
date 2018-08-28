package api.lang.stringbuffer;

public class Test02 {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
//		String c = a+b;
		a+=b;
		
		//위의 코드를 수행하기 위해 임시로 a의 사본을 만들어서 b와 더한 뒤 a에 덮어쓰기를 진행
		// -> 불필요한 복사본이 생겨서 속도가 저하됨
		// -> String Buffer 클래스를 사용하여 불필요한 복사를 방지
	}

}
