package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
//		����
		List<String> list = new ArrayList<>();
		
//		�߰�, Ȯ��, ũ��, �˻�, ����
		list.add("��Ż����");		//[0]
		list.add("�ѱ�");			//[1] -> [2]
		list.add("����");			//[2] -> [2]
		list.add("�״�����");		//[3] -> [4]
		
		list.add(1, "����");		//[1]
		
		System.out.println(list.size());	//���� ������ ����
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(99));	//����
		
		System.out.println(list.contains("�״�����"));	//true
		System.out.println(list.contains("�߱�"));	//false
		
		list.remove("ȣ��");		//x
		list.remove("��Ż����");	//o
		list.remove(1);			//�ѱ�
		
		System.out.println(list);
	}

}
