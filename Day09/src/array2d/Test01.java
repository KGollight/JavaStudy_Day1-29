package array2d;

public class Test01 {

	public static void main(String[] args) {
		// 2차원 배열 - 1차원 배열의 모음
		
		// 생성 - 3칸짜리 1차원 배열 2개를 합쳐서 생성
		int[][] a = new int[2][3];
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		// 데이터까지 지정하며 생성
		int[][] b = new int[][] {
			{1,2,3}, 
			{4,5,6}
		};
		
//		// b[0]을 반복문으로 출력
//		for(int i=0; i<b[0].length; i++) {
//			System.out.println(b[0][i]);
//		}
//		// b[1]을 반복문으로 출력
//		for(int i=0; i<b[1].length; i++) {
//			System.out.println(b[1][i]);
//		}
		
		// 전체 출력
		for(int i=0; i<b.length; i++) {
			// b[i]을 반복문으로 출력
			for(int j=0; j<b[0].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
