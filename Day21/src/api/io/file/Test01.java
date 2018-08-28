package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
//		파일 인스턴스 생성 방법
		File a = new File("files/test.txt");
		File b = new File("files\\test.txt");	//전체 경로

		File c = new File("files", "test.txt");	//폴더 + 파일명
		
		File dir = new File("files");	//폴더 인스턴스를 이용하여 생성
		File d = new File(dir, "test.txt");
		
//		파일 인스턴ㅅ를 이용하여 해당 파일을 분석
		System.out.println(c.exists());//존재?
		System.out.println(c.isFile());//,파일?
		System.out.println(c.isDirectory());//폴더?
		
		System.out.println(c.getName());//이름
		System.out.println(c.getPath());//상대경로
		System.out.println(c.getAbsolutePath());//절대경로
		
		System.out.println(c.length());//크기(글자 수)
		
		System.out.println(c.lastModified());//수정 시각
		Date date = new Date(c.lastModified());
		Format f = new SimpleDateFormat("y년 M월 d일");
		
		System.out.println(f.format(date));
	}

}
