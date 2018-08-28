package api.io.file;

public class Test05 {

	public static void main(String[] args) {
//		윈도우 탐색기

		Explorer explorer = new Explorer();
		
		while(true) {
//			목록 출력
			explorer.list();
			
//			입력
			String input = explorer.input("[입력] : ");
			explorer.move(input);
		}
		
	}
}

