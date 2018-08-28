package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException, InterruptedException {
//		싱글 바이트 입력
//		준비물 : 파일 인스턴스, 입력용 통로
//		주의사항 : 파일이 없으면 진행 불가
		
		File target = new File("files", "singles.txt");
		
		FileInputStream in = new FileInputStream(target);
		
//		[프로그램] <- in <- target <- [single.txt]
		
		while(true) {
			int n = in.read();
			if(n==-1)
				break;
			System.out.println(n);
			
//			Thread.sleep(1000);
		}
		
		in.close();
	}

}
