package api.io.file;

import java.io.File;

/**
 * ���ϰ� ���õ� ���� ����� �������� Ŭ����
 * @author HWANG
 *
 */
public class FileUtil {
	
/**
 * ����(����/����)�� ũ�⸦ ���ϴ� �޼ҵ�
 *  - ������ ���� �����ϴ��� ũ�� 2������ ������ ����
 * 		[����] ũ�⸦ ���Ͽ� ��ȯ
 * 		[����] ���빰�� ������ ũ�⸦ ���Ͽ� ��ȯ
 */
	public long size(File file) {
		long total = 0L;
		if(file.isFile()) {
			total = file.length();
		}
		else if(file.isDirectory()) {
			File[] list = file.listFiles();
			if(list != null) {//������ ������ �����ϰ�
				for(File f : list) {
					total += this.size(f);//���ȣ��
				}
			}
		}
		return total;
	}

//	���� ���� ī��Ʈ
//	[����] ī��Ʈ 1 ��ȯ
//	[����] ���빰�� ������ ī��Ʈ ����
	public int fileCount(File file) {
		int count = 0;
		if(file.isFile()) {
			count = 1; 
		}
		else if(file.isDirectory()) {
			File[] list = file.listFiles();
			if(list != null) {
				for(File f : list) {
					count += this.fileCount(f);
				}
			}
		}
		return count;
	}
	
//	���� ���� ī��Ʈ
	public int folderCount(File file) {
		int count = 0;
		if(file.isDirectory()) {
			count++;
			File[] list = file.listFiles();
			if(list != null) {
				for(File f : list) {
					count += this.folderCount(f);
				}
			}
		}
		return count;
	}
	
//	���� ����
	public void remove(File file) {
		if(!file.exists())	return;
		
//		if(file.isFile()) {
//			file.delete();
//			System.out.println(file.getAbsolutePath()+"���� �Ϸ�");
//		}
		if(file.isDirectory()) {
			File[] list = file.listFiles();
			if(list != null) {
				for(File f : list) {
					this.remove(f);
				}
			}
		}
		file.delete();
		System.out.println(file.getAbsolutePath()+"���� �Ϸ�");
	}
}



