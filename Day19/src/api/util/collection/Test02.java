package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
//		생성
		List<String> list = new ArrayList<>();
		
//		추가, 확인, 크기, 검색, 삭제
		list.add("이탈리아");		//[0]
		list.add("한국");			//[1] -> [2]
		list.add("가나");			//[2] -> [2]
		list.add("네덜란드");		//[3] -> [4]
		
		list.add(1, "피지");		//[1]
		
		System.out.println(list.size());	//실제 데이터 개수
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(99));	//오류
		
		System.out.println(list.contains("네덜란드"));	//true
		System.out.println(list.contains("중국"));	//false
		
		list.remove("호주");		//x
		list.remove("이탈리아");	//o
		list.remove(1);			//한국
		
		System.out.println(list);
	}

}
