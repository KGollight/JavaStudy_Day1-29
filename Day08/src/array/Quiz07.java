package array;

public class Quiz07 {

	public static void main(String[] args) {
		// (3) 2���� �ݺ��Ͽ� ���� ���� �����ͺ��� ������� ��ġ�ϵ��� ����
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int small=0;
		int tmp=0;
		
		for(int i=0; i<arr.length; i++) { // 
			for(int j=0; j<arr.length-i-1; j++) { // �ּڰ�
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
