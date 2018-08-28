package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explorer {
	
//	변수 : 기준폴더, Scanner
	private File base;
	private Scanner s;
	
//	생성자
	public Explorer() {
		s = new Scanner(System.in);
	}
	
// 출력
	public void list() {
		if(base == null) {//base가 null일 경우는 드라이브 출력
			List<File> list = new ArrayList<>();
			
			for(char i='A'; i <= 'Z'; i++) {
				String name = i+":/";
				File drive = new File(name);
				if(drive.exists()) {
					list.add(drive);
				}
			}
			
			System.out.println("컴퓨터에 연결된 드라이브 목록");
			for(File drive : list) {
				System.out.println(drive);
			}
		}
		else {//base != null인 경우는 폴더 출력
			System.out.println();
			System.out.println("──["+base.getAbsolutePath()+"]──");
			System.out.println();
			File[] flist = base.listFiles();
			for(File f : flist) {
				System.out.println(f.getName());
			}
		}
	}
	
//	입력
	public String input(String msg) {
		System.out.print(msg);
		return s.nextLine();
	}
	
//	경로 이동
	public void move(String input) {
		if(input.equals("종료")) {
			System.exit(0);
		}
		else if(input.equals("상위")) {
			if(base != null) {
				base = base.getParentFile();
			}
			return;
		}
		
		File target = new File(base, input);
		if(target.isDirectory()) {
			this.base = target;
		}
		else if(target.isFile()){
			System.out.println("<파일 정보>");
			System.out.println("이름 : "+target.getName());
			System.out.println("크기 : "+target.length());
		}
		else {
			System.out.println("존재하지 않는 대상입니다");
		}
	}
	
}


