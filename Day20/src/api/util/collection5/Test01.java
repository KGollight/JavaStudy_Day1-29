package api.util.collection5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
//		저장소 생성
		Map<String, List<String>> db = new HashMap<>();
		
//		입력도구 생성
		Scanner s = new Scanner(System.in);
		
		while(true) {
//			메뉴 출력
			System.out.println();
			System.out.println("─[ 연예인 협회 관리 프로그램 ]─");
			System.out.println("1. 소속사 등록");
			System.out.println("2. 소속사 삭제");
			System.out.println("3. 연예인 등록");
			System.out.println("4. 연예인 삭제");
			System.out.println("5. 전체 연예인 목록 출력");
			System.out.println("6. 소속사별 연예인 목록 출력");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("───────────────");
			System.out.print("선택 : ");
			int choice = s.nextInt();
			s.nextLine();
			
			System.out.println();
			
			//소속사 등록
			if(choice == 1) {
				System.out.print("소속사 이름 : ");
				String company = s.nextLine();
				if(db.containsKey(company)) {
					System.out.println("이미 등록되어 있는 소속사 이름입니다.");
				}
				else {
					db.put(company, new ArrayList<>());
					System.out.println("소속사 등록이 완료되었습니다.");
				}
			}
			//소속사 삭제
			else if(choice == 2) {
				System.out.print("소속사 이름 : ");
				String company = s.nextLine();
				if(db.containsKey(company)) {
					db.remove(company);
					System.out.println("소속사 삭제가 완료되었습니다.");
				}
				else {
					System.out.println("등록되지 않은 소속사 이름입니다.");
				}
			}
			//연예인 등록
			else if(choice == 3) {
				System.out.print("소속사 이름 : ");
				String company = s.nextLine();
				System.out.print("연예인 이름 : ");
				String talent = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					if(list.contains(talent)) {
						System.out.println("이미 등록되어 있는 연예인 이름입니다.");
					}
					else {
						list.add(talent);
						System.out.println("연예인 등록이 완료되었습니다.");
					}
				}
				else {
					System.out.println("등록되지 않은 소속사 이름입니다.");
				}
				
			}
			//연예인 삭제
			else if(choice == 4) {
				System.out.print("소속사 이름 : ");
				String company = s.nextLine();
				System.out.print("연예인 이름 : ");
				String talent = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					if(list.contains(talent)) {
						list.remove(talent);
						System.out.println("연예인 삭제가 완료되었습니다.");
					}
					else {
						System.out.println("등록되지 않은 연예인 이름입니다.");
					}
				}
				else {
					System.out.println("등록되지 않은 소속사 이름입니다.");
				}
			}
			//전체 연예인 목록 출력
			else if(choice == 5) {
				if(db.size() > 0) {
					System.out.println("### 전체 연예인 목록 정보 ###");
					for(Map.Entry<String, List<String>> entry : db.entrySet()) {
						String company = entry.getKey();
						List<String> list = entry.getValue();
						
						System.out.println("["+company+"] 소속 연예인 목록("+list.size()+"명)");
						for(String name : list) {
							System.out.println("→ "+name);
						}
					}
				}
				else {
					System.out.println("등록된 정보가 없습니다");
				}
			}
			//소속사 연예인 목록 출력
			else if(choice == 6) {
				System.out.print("소속사 이름 : ");
				String company = s.nextLine();
				
				if(db.containsKey(company)) {
					List<String> list = db.get(company);
					System.out.println("["+company+"] 소속 연예인 목록("+list.size()+"명)");
					for(String name : list) {
						System.out.println("→ "+name);
					}
				}
				else {
					System.out.println("등록되지 않은 소속사 이름입니다.");
				}
			}
			//종료
			else if(choice == 0) {
				System.out.println("프로그램을 종료합니다");
				s.close();
				System.exit(0);
			}
			//잘못된 입력
			else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}
