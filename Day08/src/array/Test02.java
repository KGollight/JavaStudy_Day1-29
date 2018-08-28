package array;

public class Test02 {

	public static void main(String[] args) {
		// 배열 생성
		int[] a = new int[3];	// int를 3개 보관할 수 있는 배열
		
		// 저장
		for(int i=0; i<3; i++) {
			a[i] = (i+1)*10;
		}
		
		// 출력
		for(int i=0; i<3; i++) {
			System.out.println(a[i]);
		}
	}

}
