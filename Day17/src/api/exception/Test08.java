package api.exception;

public class Test08 {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		int n;
		try {
			n = r.div(10, 3);
			System.out.println("n = "+n);
		} catch (Exception e) {
			System.out.println("예외 발생!");
			e.printStackTrace();
		}
	}

}
