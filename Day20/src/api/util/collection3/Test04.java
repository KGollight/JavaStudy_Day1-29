package api.util.collection3;

import java.util.Iterator;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
//		Set�� ������ ��ü ����
//		 - �������� ������ ������ �Ұ����ϰ� ��ü�θ� ó���� ����
		
		Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(set);
		
//		[��� 1] Iterator ���
//		set���� .get()�� �����Ƿ� ������ ����ҿ� �Űܼ� ó���ؾ� �Ѵ�.
		Iterator<Integer> it = set.iterator();
		
//		Iterator���� Scanneró�� .next()�� .hasNext()�� ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------------");
		
//		[��� 2] Ȯ�� �ݺ���
		for(Integer v : set) {
			System.out.println(v);
		}
	}

}
