package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

	/**
	 * 파일을 복사하는 메소드
	 * [파일] 싱글 바이트 복사
	 * [폴더] 목적지에 생성한 뒤 내용물을 복사
	 * @param a 복사할 원본 파일 인스턴스(실제로 존재함)
	 * @param b 복사할 목적지 파일의 인스턴스(실제로 존재하지 않음)
	 */
	public void copy(File read, File write) throws IOException {
		System.out.println("원본 : "+read.getAbsolutePath());
		System.out.println("대상 : "+write.getAbsolutePath());
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
				System.out.println(read.getAbsolutePath()+"를 복사하다가 오류가 발생했습니다");
//				e.printStackTrace();
			}
		}
		else if(read.isDirectory()) {
//			[1] 폴더를 만든다(b)
			write.mkdirs();
			
//			[2] 내용물을 추출하여 복사를 시킨다
			File[] list = read.listFiles();
			if(list != null) {
				for(File f : list) {
					File target = new File(write, f.getName());//복사할 대상의 인스턴스
					this.copy(f, target);
				}
			}
		}
	}
	
}
