package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
//		�̱� ����Ʈ ���
//		�غ� : ���� �ν��Ͻ�, ��¿� ���
		
		File target = new File("files", "singles.txt");
		
//		target.createNewFile();
		
		FileOutputStream out = new FileOutputStream(target);
		
//		[���α׷�] -> out -> target -> [single.txt]
		
		out.write(65);//A
		out.write(97);//a
		out.write(30000);//48(�սǹ߻�, byte���� �ʰ�)
		out.write(9);//\t
		
		out.write(104);//h
		out.write(101);//e
		out.write(108);//l
		out.write(108);//l
		out.write(111);//o
		out.write(10);//\n
		
//		����� ��δ� ������ ����ؾ� �Ѵ�.
		out.close();
	}

}
