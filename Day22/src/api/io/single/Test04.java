package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {
		
		File read = new File("C:\\SW���¿�\\a.��ġ����\\editplus", "epp430_64bit.exe");
		FileInputStream in = new FileInputStream(read);
		
		File write = new File("C:\\copy.exe");
		FileOutputStream out = new FileOutputStream(write);
		
//		����
		long total = read.length();
		long copy = 0L;
		
		while(true) {
			int n = in.read();
			if(n==-1)
				break;
			
			out.write(n);
			copy++;
			System.out.println("������ : "+copy+" / "+total+" byte ( "+(double)copy*100/total+" % )");
		}

//		��� ���
		in.close();
		out.close();
	}

}
