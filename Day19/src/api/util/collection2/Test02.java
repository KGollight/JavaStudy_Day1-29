package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		List<Talent> list = new ArrayList<>();
		
		list.add(new Talent("아이유"));
		list.add(new Talent("아이린"));
		list.add(new Talent("강다니엘"));
		list.add(new Talent("수지"));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("***투표대상 입력***");
			String name = s.nextLine();
			
			if(name.equals("종료"))
				break;
			
			Talent target = null;
			for(int i=0; i<list.size(); i++) {
				Talent t = list.get(i);
				if(t.getName().equals(name)) {
//					t.setVote(t.getVote()+1);
//					t.vote();
					target = t;
				}
			}
			
//			target의 유무에 따라 검색 여부를 판정
			if(target==null) {
				System.out.println("그런 후보 없습니다.");
			}
			else {
				target.vote();
				System.out.println("투표가 완료되었습니다. 현재 총"+target.getTotal()+"표 중에 "+target.getVote()+"표");
			}
				
		}
		
		s.close();
		
//		출력 
		for(int i=0; i<list.size(); i++) {
			Talent t = list.get(i);
			t.print();
		}
	}

}
