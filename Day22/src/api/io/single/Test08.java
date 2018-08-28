package api.io.single;

import java.io.File;
import java.io.IOException;

public class Test08 {

	public static void main(String[] args) throws IOException {
		
		FileUtil util = new FileUtil();
		
		File a = new File("files", "single.txt");
		File b = new File("files", "copy.txt");
		
		util.copy(a, b);
	}

}
