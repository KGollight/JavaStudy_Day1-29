package api.util.collection4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> company = new HashSet<>();
		TalentManager tm = new TalentManager();
		
		while(true) {
			tm.menu();
			System.out.print("선택 : ");
			int n = s.nextInt();
			s.nextLine();
			
			if(n==0)	break;
			
			switch(n) {
			case 1://소속사 등록
				System.out.println("<소속사를 입력하세요>");
				String cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("이미 등록된 소속사입니다.");
				}
				else {
					System.out.println("등록이 완료되었습니다.");
					company.add(cname);
					break;
				}
			case 2://소속사 삭제
				System.out.println("<소속사를 입력하세요>");
				cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("삭제가 완료되었습니다.");
					company.remove(cname);
					break;
				}
				else {
					System.out.println("등록되지않은 소속사입니다.");
				}
			case 3://연예인 등록
				System.out.println("<소속사를 입력하세요>");
				cname = s.nextLine();
				if(company.contains(cname)) {
					System.out.println("<연예인 이름을 입력하세요>");
					String tname = s.nextLine();
				}
				else {
					System.out.println("존재하지 않는 소속사입니다.");
					break;
				}
			case 4:
				
			case 5:
				
			case 6:
			}
			
			
			
			
			
		}
		
		
		s.close();
	}

}
