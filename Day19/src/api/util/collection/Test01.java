package api.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		
//		����Һ��� ���� ������ ���̰� �����Ѵ�.
		Collection<String> a = new TreeSet<>();		//��ȭ��ȣ��
		Collection<String> b = new ArrayList<>();	//��ȭ���
		
//		�߰� : add()
		a.add("����");			b.add("����");
		a.add("���ʿ�");			b.add("���ʿ�");
		a.add("���座��");			b.add("���座��");
		a.add("������");			b.add("������");
		a.add("��翬");			b.add("��翬");
		
		System.out.println(a);	//[��翬, ���座��, ����, ���ʿ�, ������]
		System.out.println(b);	//[����, ���ʿ�, ���座��, ������, ��翬]
	}

}
