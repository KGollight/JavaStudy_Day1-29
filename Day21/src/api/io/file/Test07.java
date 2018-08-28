package api.io.file;

import java.io.File;

public class Test07 {

	public static void main(String[] args) {
		File target = new File("C:\\SW±èÅÂ¿ì");
		
		FileUtil util = new FileUtil();
		
//		System.out.println(util.size(target));
		System.out.println(util.fileCount(target));
		System.out.println(util.folderCount(target));
	}

}
