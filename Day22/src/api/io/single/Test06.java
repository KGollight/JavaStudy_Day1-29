package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {

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
		
		File target = new File("files", "single2.txt");
		
		FileInputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[5];
		
		while(true) {
			int size = in.read(buffer);
			if(size==-1)	break;
			System.out.println(size+"/"+Arrays.toString(buffer));
			
//			Thread.sleep(1000L);
		}
		
		in.close();
	}

}
