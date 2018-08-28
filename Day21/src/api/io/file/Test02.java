package api.io.file;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
//		���� �м�
		File dir = new File("C:/");
		
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		
//		������ ��� ������ �۾�
//		 -> ���빰 ���� : �������� �ʴ� ������� null�� ��ȯ
		File[] list = dir.listFiles();
		System.out.println(list.length);
		
		for(File f : list) {
			System.out.println(f.getAbsolutePath());
		}
	}

}
