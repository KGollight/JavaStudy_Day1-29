package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {
		
		File read = new File("C:\\SW김태우\\a.설치파일\\editplus", "epp430_64bit.exe");
		FileInputStream in = new FileInputStream(read);
		
		File write = new File("C:\\copy.exe");
		FileOutputStream out = new FileOutputStream(write);
		
//		복사
		long total = read.length();
		long copy = 0L;
		
		while(true) {
			int n = in.read();
			if(n==-1)
				break;
			
			out.write(n);
			copy++;
			System.out.println("복사중 : "+copy+" / "+total+" byte ( "+(double)copy*100/total+" % )");
		}

//		통로 폐기
		in.close();
		out.close();
	}

}
