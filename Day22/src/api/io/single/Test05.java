package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException {
//		�̱� ����Ʈ�� �ѹ��� ������ �������� ���(byte[])
		
		File target = new File("files", "single2.txt");
		FileOutputStream out = new FileOutputStream(target);
		
//		����(buffer) �غ�
		byte[] buffer = new byte[] {
//				65, 66, 67
			'A', 'B', 'C', 'D', 'E', '\t', 'h', 'e', 'l', 'l', 'o', '\n'	
		};
		
		out.write(buffer);//buffer�� ��� �����͸� ��������
		out.write(buffer, 0, 5);//buffr�� 0�� ��ġ���� 5���� ��������
		out.write(buffer, 6, 5);//hello
		
		out.close();
	}

}
