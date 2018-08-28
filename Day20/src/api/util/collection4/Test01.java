package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
//		Map<K, V>	Set�� value�� �ٿ����� ����
//					K(key) - Set�� �����ϰ� �ߺ� �Ұ�, ���� ����
//					V(value) - �ߺ� ����, key�� ����
		
		Map<String, Integer> map = new HashMap<>();
		
//		�߰�, ����, �˻�, ����, ����
		map.put("a", 10);
		map.put("b", 10);
		map.put("c", 20);
		map.put("d", 20);
		
//		�ߺ� �����͸� �߰��ϸ� ���� �����Ͱ� ����
		map.put("d", 50);
		
//		�˻� - k�� v�� ���� ó��
		System.out.println(map.containsKey("a"));//true
		System.out.println(map.containsValue(50));//true
		
//		����
		Integer a = map.remove("d");
		Integer b = map.remove("z");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
//		����
		System.out.println(map.get("a"));
		System.out.println(map.get("x"));
		
		System.out.println(map);
		System.out.println(map.size());
	}

}
