package array2d;

public class Test01 {

	public static void main(String[] args) {
		// 2���� �迭 - 1���� �迭�� ����
		
		// ���� - 3ĭ¥�� 1���� �迭 2���� ���ļ� ����
		int[][] a = new int[2][3];
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		// �����ͱ��� �����ϸ� ����
		int[][] b = new int[][] {
			{1,2,3}, 
			{4,5,6}
		};
		
//		// b[0]�� �ݺ������� ���
//		for(int i=0; i<b[0].length; i++) {
//			System.out.println(b[0][i]);
//		}
//		// b[1]�� �ݺ������� ���
//		for(int i=0; i<b[1].length; i++) {
//			System.out.println(b[1][i]);
//		}
		
		// ��ü ���
		for(int i=0; i<b.length; i++) {
			// b[i]�� �ݺ������� ���
			for(int j=0; j<b[0].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
