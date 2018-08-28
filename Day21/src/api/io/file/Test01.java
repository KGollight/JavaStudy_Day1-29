package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
//		���� �ν��Ͻ� ���� ���
		File a = new File("files/test.txt");
		File b = new File("files\\test.txt");	//��ü ���

		File c = new File("files", "test.txt");	//���� + ���ϸ�
		
		File dir = new File("files");	//���� �ν��Ͻ��� �̿��Ͽ� ����
		File d = new File(dir, "test.txt");
		
//		���� �ν��Ϥ��� �̿��Ͽ� �ش� ������ �м�
		System.out.println(c.exists());//����?
		System.out.println(c.isFile());//,����?
		System.out.println(c.isDirectory());//����?
		
		System.out.println(c.getName());//�̸�
		System.out.println(c.getPath());//�����
		System.out.println(c.getAbsolutePath());//������
		
		System.out.println(c.length());//ũ��(���� ��)
		
		System.out.println(c.lastModified());//���� �ð�
		Date date = new Date(c.lastModified());
		Format f = new SimpleDateFormat("y�� M�� d��");
		
		System.out.println(f.format(date));
	}

}
