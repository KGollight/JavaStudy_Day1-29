package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		int vote = 0;
		map.put("������", vote);
		map.put("���̸�", vote);
		map.put("����", vote);
		map.put("������", vote);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<��ǥ �ĺ��� �Է��ϼ���>");
			System.out.println("(�ĺ�) "+map.keySet());
			String name = s.nextLine();
			
			if(name.equals("����"))
				break;
			
			if(map.containsKey(name)) {
				System.out.println(name+"���� ��ǥ�ϼ̽��ϴ�.");
				map.put(name, vote+1);
			}
			else {
				map.put(name, vote);
				System.out.println("���ο� �ĺ��� �߰��Ǿ����ϴ�.");
			}
		}
		
		s.close();
		
		System.out.println(map);
	}

}
