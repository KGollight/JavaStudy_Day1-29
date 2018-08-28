package api.util.collection3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
//		Set<E>	순서가 무시되는 저장소(자체적인 저장 방식이 존재하는 저장소)
//				전체를 빠르게 접근하는 것이 목적(일괄 처리)
//				TreeSet(오름차순), HashSet(해싱)
		
		Set<String> a = new TreeSet<>();
		Set<String> b = new HashSet<>();
		
		a.add("java");			b.add("java");
		a.add("c");				b.add("c");
		a.add("python");		b.add("python");
		a.add("android");		b.add("android");
		a.add("java");			b.add("java");//중복 데이터 추가 불가
		
		System.out.println(a);
		System.out.println(b);
	}

}
