package api.lang.etc;

public class Test04 {

	public static void main(String[] args) {
		//System 클래스		운영체제의 정보를 보관하는 클래스
		
		//운영체제와 프로그램은 3가지의 통로로 연결되어 있다.
		//System.in / System.out / System.err
		System.err.println("하이");
		System.out.println("하이");
		
		//운영체제의 정보
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name"));	//특정 운영체제에서만 사용 가능한 프로그램일 시 조건으로 사용
		
		System.out.println(System.getProperty("user.home"));	//계정 폴더
		System.out.println(System.getProperty("user.dir"));		//프로그램 실행 폴더
		
		//프로그램 종료
		System.exit(0);
	}

}
