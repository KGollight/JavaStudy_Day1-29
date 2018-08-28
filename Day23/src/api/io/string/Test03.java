package api.io.string;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
//		싱글바이트 입력을 사용하여 string.txt의 내용을 읽어와 출력
		File target = new File("files", "string.txt");
		FileInputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[(int) target.length()];
		
		in.read(buffer);
		
		in.close();
		
		String str = new String(buffer);
		System.out.println(str);
	}

}
