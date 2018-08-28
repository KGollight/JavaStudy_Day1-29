package array;

public class Test04 {

	public static void main(String[] args) {
		// 배열을 생성하는 방법은 여러가지가 있다
		int[] a = new int[3];
		int b[] = new int[3];
		
		int[] c = new int[] {1, 3, 5};
		
		double[] d = new double[3];
		
		// 배열의 칸 수는 내장 변수에 저장되어 있다
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
	}

}
