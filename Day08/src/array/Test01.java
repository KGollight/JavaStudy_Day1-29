package array;

public class Test01 {

	public static void main(String[] args) {
		// �迭 ����
		int[] a = new int[3];	// int�� 3�� ������ �� �ִ� �迭
		
		// a	--->	[0][0][0]
		
		// ����
		// a = 10; => x
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		// ���
		System.out.println(a);
		System.out.println(a[0]);	// a�� +0������ �����϶�
		System.out.println(a[1]);	// a�� +1������ �����϶�
		System.out.println(a[2]);	// a�� +2������ �����϶�
		//System.out.println(a[3]);	// a�� +3������ �����϶� => ����
	}

}
