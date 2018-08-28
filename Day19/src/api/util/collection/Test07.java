package api.util.collection;

import java.util.List;

public class Test07 {

	public static void main(String[] args) {
//		List와 배열의 호환관계
//		 -> 호환나 가능(List에서 배열로 변경은 가능)
		
//		임시 List 생성(크기 변경 불가, 자바9부터 가능)
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list.getClass());
		
//		list를 배열로 변경
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
