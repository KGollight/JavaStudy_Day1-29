package api.util.collection4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
//		Map도 전체 데이터 조회가 가능하다.
//		[1] key값만 추출
//		[2] Map.EntrySet 형태로 추출(key=value)
		
//		샘플로 이름=점수 형태의 맵을 생성
		Map<String, Integer> map = new HashMap<>();
		map.put("휘성", 80);
		map.put("케이윌", 85);
		map.put("아웃사이더", 77);
		map.put("에일리", 80);
		map.put("버즈", 82);
		
//		[1] Map의 key를 Set의 형태로 추출하여 Iterator로 반복
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("key = "+key+", value = "+value);
		}
		
		System.out.println();
		
//		확장 반복문
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("key = "+key+", value = "+value);
		}
		
		System.out.println();
		
//		[2] 
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key = "+entry.getKey()+", value = "+entry.getValue());
		}
	}

}
