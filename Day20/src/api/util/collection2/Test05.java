package api.util.collection2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test05 {

	public static void main(String[] args) {
//		���� ������ List
//		������ �޶� �����Ͽ� ������ �� �ִ�(���� ��ĸ� �ٸ���)
		
		List<String> a = new ArrayList<>();
		System.out.println(a.getClass());
		
		List<String> b = new LinkedList<>();
		System.out.println(b.getClass());
		
		List<String> c = new Vector<>();
		System.out.println(c.getClass());
		
		a.add("hello");
		b.add("hello");
		c.add("hello");
	}

}
