package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		List<File> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		for(char i='A'; i<='Z'; i++) {
			String name = i+":/";
			File drive = new File(name);
			if(drive.exists()) {
				list.add(drive);
			}
		}
		while(true) {

			System.out.println("<드라이브 목록>");
			System.out.println(list);
			
			System.out.println("<경로를 입력하세요>");
			String input = s.nextLine();
			
			if(input=="종료")
				break;

			File dir = new File(input);
			if(dir.isDirectory()) {	//폴더일 경우
				File[] fileList = dir.listFiles();
				for(File f : fileList) {
					System.out.println(f.getName());
				}
			}
			else if(dir.isFile()) {	//파일일 경우
				File file = new File(dir.getName(), input);
				System.out.println(file.getName());
				System.out.println(file.length());
			}
			else
				System.out.println("존재하지 않습니다.");
			
			
		}
		s.close();
	}

}
