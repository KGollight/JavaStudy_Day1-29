package api.util.collection4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test05 {

	public static void main(String[] args) {
		
//		���� ������ Collection
		
		Map<String, List<String>> map = new HashMap<>();
		
//		�߰�
		map.put("ȸ��", new ArrayList<>());
		
//		ȸ�� �����׸� �߰�
		map.get("ȸ��").add("���");
		map.get("ȸ��").add("������");
		map.get("ȸ��").add("�����");
		map.get("ȸ��").add("�մ�");
		map.get("ȸ��").add("���");
		
		System.out.println(map);
	}

}
