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

			System.out.println("<����̺� ���>");
			System.out.println(list);
			
			System.out.println("<��θ� �Է��ϼ���>");
			String input = s.nextLine();
			
			if(input=="����")
				break;

			File dir = new File(input);
			if(dir.isDirectory()) {	//������ ���
				File[] fileList = dir.listFiles();
				for(File f : fileList) {
					System.out.println(f.getName());
				}
			}
			else if(dir.isFile()) {	//������ ���
				File file = new File(dir.getName(), input);
				System.out.println(file.getName());
				System.out.println(file.length());
			}
			else
				System.out.println("�������� �ʽ��ϴ�.");
			
			
		}
		s.close();
	}

}
