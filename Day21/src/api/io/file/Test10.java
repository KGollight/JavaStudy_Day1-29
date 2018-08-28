package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test10 {

	public static void main(String[] args) throws IOException {
//		신규 파일과 폴더를 생성
//		[파일] .createNewFile()
//		[폴더] .mkdirs()
		
		File target = new File("hello");
		
//		target.createNewFile();
		target.mkdirs();
	}

}
