package api.io.file;

public class Test05 {

	public static void main(String[] args) {
//		������ Ž����

		Explorer explorer = new Explorer();
		
		while(true) {
//			��� ���
			explorer.list();
			
//			�Է�
			String input = explorer.input("[�Է�] : ");
			explorer.move(input);
		}
		
	}
}

