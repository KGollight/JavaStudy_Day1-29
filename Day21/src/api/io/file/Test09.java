package api.io.file;

import java.io.File;

public class Test09 {

	public static void main(String[] args) {
		File dir = new File("C:\\Test");
		
		FileUtil util = new FileUtil();
		
		util.remove(dir);
	}

}
