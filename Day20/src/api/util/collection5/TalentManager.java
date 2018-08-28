package api.util.collection5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TalentManager {
	
//	변수 : 저장소 / 스캐너
	private Map<String, List<String>> db = new HashMap<>();
	private Scanner s  = new Scanner(System.in);
	
//	메뉴 표시
	public void menu() {
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
	}
	
//	숫자 입력
	public int numberInput(String message) {
		System.out.print(message);
		int choice = s.nextInt();
		s.nextLine();
		return choice;
	}
	
//	문자열 입력
	public String stringInput(String message) {
		System.out.print(message);
		String line = s.nextLine();
		return line;
	}
	
//	1번 메뉴(소속사 등록)
	public void addCompany(String company) {
		if(db.containsKey(company)) {
			System.out.println("이미 등록되어 있는 소속사 이름입니다.");
		}
		else {
			db.put(company, new ArrayList<>());
			System.out.println("소속사 등록이 완료되었습니다.");
		}
	}
//	2번 메뉴(소속사 삭제)
	public void removeCompany(String company) {
		if(db.containsKey(company)) {
			db.remove(company);
			System.out.println("소속사 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("등록되지 않은 소속사 이름입니다.");
		}
	}
//	3번 메뉴(연예인 등록)
	public void addTalent(String company, String talent) {
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
//	4번 메뉴(연예인 삭제)
	public void removeTalent(String company, String talent) {
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
//	5번 메뉴(전체 연예인 출력)
	public void listAll() {
		if(db.size() > 0) {
			System.out.println("### 전체 연예인 목록 정보 ###");
//			for(Map.Entry<String, List<String>> entry : db.entrySet()) {
//				String company = entry.getKey();
			for(String company : db.keySet()) {
				this.list(company);
			}
		}
		else {
			System.out.println("등록된 정보가 없습니다");
		}
	}
	
//	6번 메뉴(소속사 연예인 출력)
	public void list(String company) {
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
	
//	0번 메뉴(종료)
	public void exit() {
		s.close();
		System.exit(0);
	}
	
//	메뉴별 처리
	public void process(int choice) {
		//소속사 등록
		if(choice == 1) {
			String company = this.stringInput("소속사 이름 : ");
			this.addCompany(company);
		}
		//소속사 삭제
		else if(choice == 2) {
			String company = this.stringInput("소속사 이름 : ");
			this.removeCompany(company);
		}
		//연예인 등록
		else if(choice == 3) {
			String company = this.stringInput("소속사 이름 : ");
			String talent = this.stringInput("연예인 이름 : ");
			this.addTalent(company, talent);
		}
		//연예인 삭제
		else if(choice == 4) {
			String company = this.stringInput("소속사 이름 : ");
			String talent = this.stringInput("연예인 이름 : ");
			this.removeTalent(company, talent);
		}
		//전체 연예인 목록 출력
		else if(choice == 5) {
			this.listAll();
		}
		//소속사 연예인 목록 출력
		else if(choice == 6) {
			String company = this.stringInput("소속사 이름 : ");
			this.list(company);
		}
		//종료
		else if(choice == 0) {
			this.exit();
		}
		//잘못된 입력
		else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void work() {
		while(true) {
//			메뉴 출력
			this.menu();
			int choice = this.numberInput("선택 : ");
			
			System.out.println();
			
			this.process(choice);
		}
	}
	
}











