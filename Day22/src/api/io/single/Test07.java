package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) throws IOException, InterruptedException {
//		�̱� ����Ʈ�� �ѹ��� �������� �Է�(byte[])
//		 -> ��������� ������� ���� �׳� 5���� �Է¹���
//		    -> buffer�� ũ�Ⱑ 5
		
//		���� �ó�����
//		 -> 1ȸ�� : 5����	(5/22)
//		 -> 2ȸ�� : 5����	(10/22)
//		 -> 3ȸ�� : 5����	(15/22)
//		 -> 4ȸ�� : 5����	(20/22)
//		 -> 5ȸ�� : 2����	(22/22)
		
		File read = new File("files", "single2.txt");
		FileInputStream in = new FileInputStream(read);

		File write = new File("C:\\copy.exe");
		FileOutputStream out = new FileOutputStream(write);
//		����
		long total = read.length();
		long copy = 0L;
		
//		���� ����(1024 byte)
		byte[] buffer = new byte[1024];
		
		while(true) {
			int size = in.read(buffer);//buffer�� �����ϰ� ����ũ�⸦ size�� ��ȯ
			if(size == -1) break;
			
			out.write(buffer, 0, size);//buffer�� 0���� size�� ��������
			copy += size;
			System.out.println("������ : "+copy+" / "+total+" byte ( "+(double)copy*100/total+" % )");
		}
		
//		��� ���
		in.close();
		out.close();
	}

}
