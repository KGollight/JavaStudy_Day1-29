package api.lang.etc;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
