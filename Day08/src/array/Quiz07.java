package array;

public class Quiz07 {

	public static void main(String[] args) {
		// (3) 2번을 반복하여 가장 작은 데이터부터 순서대로 배치하도록 구현
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int small=0;
		int tmp=0;
		
		for(int i=0; i<arr.length; i++) { // 
			for(int j=0; j<arr.length-i-1; j++) { // 최솟값
				if(arr[small]>arr[i])
					small=i;
			}
		}
		System.out.println("\n");
		for(int i=0; i<arr.length; i++) {
			System.out.print("<"+arr[i]+"> ");
		}
	}

}
