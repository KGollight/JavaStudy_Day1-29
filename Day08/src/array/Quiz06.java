package array;

public class Quiz06 {

	public static void main(String[] args) {
		// (2) 가장 작은 데이터가 맨 앞 데이터와 교체되도록 코드 구현
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int small=0;
		int tmp=0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<arr[i+1])
				small=arr[i];
			else
				small=arr[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			if(small==arr[i]) {
				tmp=arr[0];
				arr[0]=arr[i];
				arr[i]=tmp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("<"+arr[i]+"> ");
		}
	}

}
