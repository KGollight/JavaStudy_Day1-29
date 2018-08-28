package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println("list :\t"+list);
		
//		Collections라는 도우미 클래스를 이용하여 각종 전체 처리를 쉽게 구현
		Collections.reverse(list);
		System.out.println("reverse :"+list);
		
		Collections.shuffle(list);
		System.out.println("shuffle :"+list);
		
		Collections.sort(list);
		System.out.println("sort :\t"+list);
	}

}
