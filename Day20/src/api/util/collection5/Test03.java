package api.util.collection5;

public class Test03 {
	public static void main(String[] args) {
		
		TalentManager manager = new TalentManager();
		
		while(true) {
//			�޴� ���
			manager.menu();
			int choice = manager.numberInput("���� : ");
			
			System.out.println();
			
			manager.process(choice);
		}
	}
}
