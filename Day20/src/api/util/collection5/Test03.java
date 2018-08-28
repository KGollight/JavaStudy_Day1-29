package api.util.collection5;

public class Test03 {
	public static void main(String[] args) {
		
		TalentManager manager = new TalentManager();
		
		while(true) {
//			메뉴 출력
			manager.menu();
			int choice = manager.numberInput("선택 : ");
			
			System.out.println();
			
			manager.process(choice);
		}
	}
}
