package api.util.collection4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test05 {

	public static void main(String[] args) {
		
//		복합 형태의 Collection
		
		Map<String, List<String>> map = new HashMap<>();
		
//		추가
		map.put("회원", new ArrayList<>());
		
//		회원 세부항목 추가
		map.get("회원").add("운영자");
		map.get("회원").add("관리자");
		map.get("회원").add("사용자");
		map.get("회원").add("손님");
		map.get("회원").add("운영자");
		
		System.out.println(map);
	}

}
