package api.util.collection5;

public class Test02 {
	public static void main(String[] args) {
		
		TalentManager manager = new TalentManager();
		
		while(true) {
//			메뉴 출력
			manager.menu();
			int choice = manager.numberInput("선택 : ");
			
			System.out.println();
			
			//소속사 등록
			if(choice == 1) {
				String company = manager.stringInput("소속사 이름 : ");
				manager.addCompany(company);
			}
			//소속사 삭제
			else if(choice == 2) {
				String company = manager.stringInput("소속사 이름 : ");
				manager.removeCompany(company);
			}
			//연예인 등록
			else if(choice == 3) {
				String company = manager.stringInput("소속사 이름 : ");
				String talent = manager.stringInput("연예인 이름 : ");
				manager.addTalent(company, talent);
			}
			//연예인 삭제
			else if(choice == 4) {
				String company = manager.stringInput("소속사 이름 : ");
				String talent = manager.stringInput("연예인 이름 : ");
				manager.removeTalent(company, talent);
			}
			//전체 연예인 목록 출력
			else if(choice == 5) {
				manager.listAll();
			}
			//소속사 연예인 목록 출력
			else if(choice == 6) {
				String company = manager.stringInput("소속사 이름 : ");
				manager.list(company);
			}
			//종료
			else if(choice == 0) {
				manager.exit();
			}
			//잘못된 입력
			else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}
