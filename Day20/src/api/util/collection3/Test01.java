package api.util.collection3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
//		Set<E>	������ ���õǴ� �����(��ü���� ���� ����� �����ϴ� �����)
//				��ü�� ������ �����ϴ� ���� ����(�ϰ� ó��)
//				TreeSet(��������), HashSet(�ؽ�)
		
		Set<String> a = new TreeSet<>();
		Set<String> b = new HashSet<>();
		
		a.add("java");			b.add("java");
		a.add("c");				b.add("c");
		a.add("python");		b.add("python");
		a.add("android");		b.add("android");
		a.add("java");			b.add("java");//�ߺ� ������ �߰� �Ұ�
		
		System.out.println(a);
		System.out.println(b);
	}

}
