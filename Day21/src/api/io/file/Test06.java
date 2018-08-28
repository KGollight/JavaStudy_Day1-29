package api.io.file;

import java.io.File;

public class Test06 {

	public static void main(String[] args) {
//		폴더의 크기를 구할 수 있겠는가?
		File dir = new File("C:\\SW김태우");
		
		System.out.println(dir.length());
		
//		일반적으로 말하는 폴더의 크기 = 안에 들어있는 모든 파일의 크기의 합
//		안에 폴더가 몇 개인지, 파일이 몇 개인지 모른다.
//		메소드를 만들어 재귀호출로 처리
		
		FileUtil util = new FileUtil();
		long size = util.size(dir);
		System.out.println("size = "+size);
	}

}
