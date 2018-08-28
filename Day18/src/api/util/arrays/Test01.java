package api.util.arrays;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
//		Arrays	배열 도우미 클래스
		
		int[] data = new int[] { 3, 5, 2, 1, 4 };
		
//		출력
		System.out.println(Arrays.toString(data));
		
//		정렬
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
//		채우기
		Arrays.fill(data, 10);
		System.out.println(Arrays.toString(data));
		
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 1, 2, 3 };
		
		System.out.println(a==b);					//false
		System.out.println(a.equals(b));			//false
		System.out.println(Arrays.equals(a, b));	//true
	}

}
