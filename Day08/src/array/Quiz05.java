package array;

public class Quiz05 {

	public static void main(String[] args) {
		// (1) ���� ���� ���� ����ִ� ��ġ(index)�� ���Ͽ� ȭ�鿡 ���
		int[] arr = new int[] {3, 5, 2, 1, 4};
		int small=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[small]>arr[i])
				small=i;
		}
		System.out.println("�迭���� ���� ���� �� arr["+small+"]");
	}

}
