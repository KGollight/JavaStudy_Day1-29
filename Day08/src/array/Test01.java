package array;

public class Test01 {

	public static void main(String[] args) {
		// 배열 생성
		int[] a = new int[3];	// int를 3개 보관할 수 있는 배열
		
		// a	--->	[0][0][0]
		
		// 저장
		// a = 10; => x
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		// 출력
		System.out.println(a);
		System.out.println(a[0]);	// a의 +0지점에 접근하라
		System.out.println(a[1]);	// a의 +1지점에 접근하라
		System.out.println(a[2]);	// a의 +2지점에 접근하라
		//System.out.println(a[3]);	// a의 +3지점에 접근하라 => 에러
	}

}
