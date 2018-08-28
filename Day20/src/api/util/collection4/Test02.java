package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		int vote = 0;
		map.put("아이유", vote);
		map.put("아이린", vote);
		map.put("수지", vote);
		map.put("조보아", vote);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<투표 후보를 입력하세요>");
			System.out.println("(후보) "+map.keySet());
			String name = s.nextLine();
			
			if(name.equals("종료"))
				break;
			
			if(map.containsKey(name)) {
				System.out.println(name+"에게 투표하셨습니다.");
				map.put(name, vote+1);
			}
			else {
				map.put(name, vote);
				System.out.println("새로운 후보가 추가되었습니다.");
			}
		}
		
		s.close();
		
		System.out.println(map);
	}

}
