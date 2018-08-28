package array;

public class Quiz04 {

	public static void main(String[] args) {
		// 배열을 뒤짚어서 출력
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int t;
		
		for(int i=0; i<arr.length/2; i++) {
			int rev = arr.length-i-1;
			t = arr[i];
			arr[i] = arr[rev];
			arr[rev] = t;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("<"+arr[i]+">");
		}
	}

}
