package api.util.collection3;

import java.util.HashSet;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
//		[1]�߰�, [2]����, [3]�˻�, [4]����, [5]����
		set.add("���缮");
		set.add("������");
		set.add("������");
		set.add("����");
		set.add("�ڸ��");
		set.add("��");
		set.add("��ȫö");
		
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains("����"));
		System.out.println(set.contains("����"));
		
		set.remove("��");
		
		System.out.println(set);
		System.out.println(set.size());
	}

}
