package api.lang.etc;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	}

}
