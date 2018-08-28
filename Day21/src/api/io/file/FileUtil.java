package api.io.file;

import java.io.File;

/**
 * 파일과 관련된 각종 기능을 만들어놓을 클래스
 * @author HWANG
 *
 */
public class FileUtil {
	
/**
 * 파일(파일/폴더)의 크기를 구하는 메소드
 *  - 개수가 많고 복잡하더라도 크게 2종류로 구분이 가능
 * 		[파일] 크기를 구하여 반환
 * 		[폴더] 내용물을 꺼내어 크기를 구하여 반환
 */
	public long size(File file) {
		long total = 0L;
		if(file.isFile()) {
			total = file.length();
		}
		else if(file.isDirectory()) {
			File[] list = file.listFiles();
			if(list != null) {//엑세스 위반은 배제하고
				for(File f : list) {
					total += this.size(f);//재귀호출
				}
			}
		}
		return total;
	}

//	파일 개수 카운트
//	[파일] 카운트 1 반환
//	[폴더] 내용물을 꺼내어 카운트 재계산
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
	
//	폴더 개수 카운트
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
	
//	폴더 삭제
	public void remove(File file) {
		if(!file.exists())	return;
		
//		if(file.isFile()) {
//			file.delete();
//			System.out.println(file.getAbsolutePath()+"삭제 완료");
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
		System.out.println(file.getAbsolutePath()+"삭제 완료");
	}
}



