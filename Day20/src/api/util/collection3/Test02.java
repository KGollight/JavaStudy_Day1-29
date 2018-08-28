package api.util.collection3;

import java.util.HashSet;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
//		[1]추가, [2]개수, [3]검색, [4]삭제, [5]추출
		set.add("유재석");
		set.add("정형돈");
		set.add("정준하");
		set.add("하하");
		set.add("박명수");
		set.add("길");
		set.add("노홍철");
		
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains("하하"));
		System.out.println(set.contains("광희"));
		
		set.remove("길");
		
		System.out.println(set);
		System.out.println(set.size());
	}

}
