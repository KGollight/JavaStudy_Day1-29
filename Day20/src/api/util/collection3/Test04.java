package api.util.collection3;

import java.util.Iterator;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
//		Set의 데이터 전체 추출
//		 - 개별적인 데이터 접근은 불가능하고 전체로만 처리가 가능
		
		Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(set);
		
//		[방법 1] Iterator 사용
//		set에는 .get()이 없으므로 별도의 저장소에 옮겨서 처리해야 한다.
		Iterator<Integer> it = set.iterator();
		
//		Iterator에는 Scanner처럼 .next()와 .hasNext()가 존재
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------------");
		
//		[방법 2] 확장 반복문
		for(Integer v : set) {
			System.out.println(v);
		}
	}

}
