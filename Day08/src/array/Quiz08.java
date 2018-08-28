package array;

public class Quiz08 {

	public static void main(String[] args) {
		// 버블 정렬
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		for(int i=data.length-2; i>=0; i--) {
			System.out.println("k의 범위 : 0부터 "+i+"까지");
			
			// 1회차 정렬
			for(int k=0; k<=i; k++) {
				System.out.println(k+"와"+(k+1)+"을 비교");
				if(data[k]>data[k+1]) {
					int tmp = data[k];
					data[k] = data[k+1];
					data[k+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
