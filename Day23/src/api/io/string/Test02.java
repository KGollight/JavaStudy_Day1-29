package api.io.string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
//		���ڿ��� ����Ʈ�� ��ȯ�Ͽ� �̱۹���Ʈ ����� ���
		
		File target = new File("files", "string.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		String text = "�Ϸ縸 �� ������ �ް���!!!";
		
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		
		out.close();
	}

}