package api.io.file;

import java.io.File;

public class Test06 {

	public static void main(String[] args) {
//		������ ũ�⸦ ���� �� �ְڴ°�?
		File dir = new File("C:\\SW���¿�");
		
		System.out.println(dir.length());
		
//		�Ϲ������� ���ϴ� ������ ũ�� = �ȿ� ����ִ� ��� ������ ũ���� ��
//		�ȿ� ������ �� ������, ������ �� ������ �𸥴�.
//		�޼ҵ带 ����� ���ȣ��� ó��
		
		FileUtil util = new FileUtil();
		long size = util.size(dir);
		System.out.println("size = "+size);
	}

}
