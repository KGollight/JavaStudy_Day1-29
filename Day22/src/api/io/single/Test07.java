package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) throws IOException, InterruptedException {
//		싱글 바이트를 한번에 여러개씩 입력(byte[])
//		 -> 몇글자인지 고려하지 말고 그냥 5개씩 입력받자
//		    -> buffer의 크기가 5
		
//		예상 시나리오
//		 -> 1회차 : 5글자	(5/22)
//		 -> 2회차 : 5글자	(10/22)
//		 -> 3회차 : 5글자	(15/22)
//		 -> 4회차 : 5글자	(20/22)
//		 -> 5회차 : 2글자	(22/22)
		
		File read = new File("files", "single2.txt");
		FileInputStream in = new FileInputStream(read);

		File write = new File("C:\\copy.exe");
		FileOutputStream out = new FileOutputStream(write);
//		복사
		long total = read.length();
		long copy = 0L;
		
//		버퍼 설정(1024 byte)
		byte[] buffer = new byte[1024];
		
		while(true) {
			int size = in.read(buffer);//buffer에 저장하고 실제크기를 size에 반환
			if(size == -1) break;
			
			out.write(buffer, 0, size);//buffer를 0부터 size개 내보내라
			copy += size;
			System.out.println("복사중 : "+copy+" / "+total+" byte ( "+(double)copy*100/total+" % )");
		}
		
//		통로 폐기
		in.close();
		out.close();
	}

}
