package api.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		
//		저장소별로 저장 형태의 차이가 존재한다.
		Collection<String> a = new TreeSet<>();		//전화번호부
		Collection<String> b = new ArrayList<>();	//통화기록
		
//		추가 : add()
		a.add("수지");			b.add("수지");
		a.add("워너원");			b.add("워너원");
		a.add("레드벨벳");			b.add("레드벨벳");
		a.add("정유미");			b.add("정유미");
		a.add("노사연");			b.add("노사연");
		
		System.out.println(a);	//[노사연, 레드벨벳, 수지, 워너원, 정유미]
		System.out.println(b);	//[수지, 워너원, 레드벨벳, 정유미, 노사연]
	}

}
