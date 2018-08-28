package array;

public class Quiz05 {

	public static void main(String[] args) {
		// (1) 가장 작은 값이 들어있는 위치(index)를 구하여 화면에 출력
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int small=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[small]>arr[i])
				small=i;
		}
		System.out.println("배열에서 가장 작은 값 arr["+small+"]");
	}

}
