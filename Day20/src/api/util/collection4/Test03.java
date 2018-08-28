package api.util.collection4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
//		Map�� ��ü ������ ��ȸ�� �����ϴ�.
//		[1] key���� ����
//		[2] Map.EntrySet ���·� ����(key=value)
		
//		���÷� �̸�=���� ������ ���� ����
		Map<String, Integer> map = new HashMap<>();
		map.put("�ּ�", 80);
		map.put("������", 85);
		map.put("�ƿ����̴�", 77);
		map.put("���ϸ�", 80);
		map.put("����", 82);
		
//		[1] Map�� key�� Set�� ���·� �����Ͽ� Iterator�� �ݺ�
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("key = "+key+", value = "+value);
		}
		
		System.out.println();
		
//		Ȯ�� �ݺ���
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
