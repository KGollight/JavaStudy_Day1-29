package api.util.collection4;

import java.util.List;

public class Test04 {

	public static void main(String[] args) {
//		�ڹٿ����� ��뷮 ����Ҹ� Iterable�̶�� ǥ���Ѵ�
		
		int[] a = new int[] {3, 5, 2, 1, 4};
		for(int v : a) {
			System.out.println(v);
		}
		
		System.out.println();
		
		List<Integer> b = List.of(1, 2, 3, 4, 5);
		for(int v : b) {
			System.out.println(v);
		}
	}

}
