package api.util.collection;

import java.util.List;

public class Test07 {

	public static void main(String[] args) {
//		List�� �迭�� ȣȯ����
//		 -> ȣȯ�� ����(List���� �迭�� ������ ����)
		
//		�ӽ� List ����(ũ�� ���� �Ұ�, �ڹ�9���� ����)
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list.getClass());
		
//		list�� �迭�� ����
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
