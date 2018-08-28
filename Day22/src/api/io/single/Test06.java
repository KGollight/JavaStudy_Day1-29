package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {

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
