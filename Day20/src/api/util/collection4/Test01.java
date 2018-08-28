package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
//		Map<K, V>	Set에 value를 붙여놓은 형태
//					K(key) - Set과 동일하게 중복 불가, 순서 무시
//					V(value) - 중복 가능, key에 종속
		
		Map<String, Integer> map = new HashMap<>();
		
//		추가, 개수, 검색, 삭제, 추출
		map.put("a", 10);
		map.put("b", 10);
		map.put("c", 20);
		map.put("d", 20);
		
//		중복 데이터를 추가하면 기존 데이터가 갱신
		map.put("d", 50);
		
//		검색 - k와 v를 따로 처리
		System.out.println(map.containsKey("a"));//true
		System.out.println(map.containsValue(50));//true
		
//		삭제
		Integer a = map.remove("d");
		Integer b = map.remove("z");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
//		추출
		System.out.println(map.get("a"));
		System.out.println(map.get("x"));
		
		System.out.println(map);
		System.out.println(map.size());
	}

}
