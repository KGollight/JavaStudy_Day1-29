package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

	/**
	 * ������ �����ϴ� �޼ҵ�
	 * [����] �̱� ����Ʈ ����
	 * [����] �������� ������ �� ���빰�� ����
	 * @param a ������ ���� ���� �ν��Ͻ�(������ ������)
	 * @param b ������ ������ ������ �ν��Ͻ�(������ �������� ����)
	 */
	public void copy(File read, File write) throws IOException {
		System.out.println("���� : "+read.getAbsolutePath());
		System.out.println("��� : "+write.getAbsolutePath());
		if(read.isFile()) {
			try (
					FileInputStream in = new FileInputStream(read);
					FileOutputStream out = new FileOutputStream(write);
					){
				
				byte[] buffer = new byte[1024];
				
				while(true) {
					int size = in.read(buffer);
					if(size == -1) break;
					out.write(buffer, 0, size);					
				}
			}catch(Exception e) {
				System.out.println(read.getAbsolutePath()+"�� �����ϴٰ� ������ �߻��߽��ϴ�");
//				e.printStackTrace();
			}
		}
		else if(read.isDirectory()) {
//			[1] ������ �����(b)
			write.mkdirs();
			
//			[2] ���빰�� �����Ͽ� ���縦 ��Ų��
			File[] list = read.listFiles();
			if(list != null) {
				for(File f : list) {
					File target = new File(write, f.getName());//������ ����� �ν��Ͻ�
					this.copy(f, target);
				}
			}
		}
	}
	
}
