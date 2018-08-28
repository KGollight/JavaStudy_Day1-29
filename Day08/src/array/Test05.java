package array;

public class Test05 {

	public static void main(String[] args) {
		// 데이터 상호 교체(swap)
		int a = 10, b = 20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
