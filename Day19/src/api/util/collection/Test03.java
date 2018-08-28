package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int tmp = 0;
		for(int i=1; i<=6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			
//			if(lotto==tmp){
//				continue;
//				i--;
//			}
			if(list.contains(lotto)) {
				System.out.println("중복 발생!");
				i--;
			}
			else
				list.add(lotto);
			
			tmp = lotto;
		}
		
//		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("로또 번호 : "+list.get(i));
		}
	}

}
