package array;

public class Test02 {

	public static void main(String[] args) {
		// �迭 ����
		int[] a = new int[3];	// int�� 3�� ������ �� �ִ� �迭
		
		// ����
		for(int i=0; i<3; i++) {
			a[i] = (i+1)*10;
		}
		
		// ���
		for(int i=0; i<3; i++) {
			System.out.println(a[i]);
		}
	}

}
