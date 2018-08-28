package api.io.file;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
//		폴더 분석
		File dir = new File("C:/");
		
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		
//		폴더일 경우 수행할 작업
//		 -> 내용물 추출 : 존재하지 않는 폴더라면 null이 반환
		File[] list = dir.listFiles();
		System.out.println(list.length);
		
		for(File f : list) {
			System.out.println(f.getAbsolutePath());
		}
	}

}
