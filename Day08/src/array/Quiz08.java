package array;

public class Quiz08 {

	public static void main(String[] args) {
		// ���� ����
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		for(int i=data.length-2; i>=0; i--) {
			System.out.println("k�� ���� : 0���� "+i+"����");
			
			// 1ȸ�� ����
			for(int k=0; k<=i; k++) {
				System.out.println(k+"��"+(k+1)+"�� ��");
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
