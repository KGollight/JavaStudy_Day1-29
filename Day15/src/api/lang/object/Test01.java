package api.lang.object;

public class Test01 {

	public static void main(String[] args) {
		
		// Object클래스는 자바의 최상위 클래스(상속 관계의 최상위)
		// - 클래스라면 반드시 가져야할 기능들을 정의해두었음
		Object a = new Object();
		Object b = new Object();
		
		System.out.println(a.getClass());	// 실제 클래스 정보를 반환
		System.out.println(a.hashCode());	// 인스턴스 일련번호를 반환
		System.out.println(a.toString());	// 인스턴스 요약정보를 반환
		
		System.out.println(b.hashCode());
	}

}
