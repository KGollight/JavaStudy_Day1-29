package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test10 {

	public static void main(String[] args) throws IOException {
//		�ű� ���ϰ� ������ ����
//		[����] .createNewFile()
//		[����] .mkdirs()
		
		File target = new File("hello");
		
//		target.createNewFile();
		target.mkdirs();
	}

}
