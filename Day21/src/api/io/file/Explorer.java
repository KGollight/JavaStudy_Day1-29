package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Explorer {
	
//	���� : ��������, Scanner
	private File base;
	private Scanner s;
	
//	������
	public Explorer() {
		s = new Scanner(System.in);
	}
	
// ���
	public void list() {
		if(base == null) {//base�� null�� ���� ����̺� ���
			List<File> list = new ArrayList<>();
			
			for(char i='A'; i <= 'Z'; i++) {
				String name = i+":/";
				File drive = new File(name);
				if(drive.exists()) {
					list.add(drive);
				}
			}
			
			System.out.println("��ǻ�Ϳ� ����� ����̺� ���");
			for(File drive : list) {
				System.out.println(drive);
			}
		}
		else {//base != null�� ���� ���� ���
			System.out.println();
			System.out.println("����["+base.getAbsolutePath()+"]����");
			System.out.println();
			File[] flist = base.listFiles();
			for(File f : flist) {
				System.out.println(f.getName());
			}
		}
	}
	
//	�Է�
	public String input(String msg) {
		System.out.print(msg);
		return s.nextLine();
	}
	
//	��� �̵�
	public void move(String input) {
		if(input.equals("����")) {
			System.exit(0);
		}
		else if(input.equals("����")) {
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
			System.out.println("<���� ����>");
			System.out.println("�̸� : "+target.getName());
			System.out.println("ũ�� : "+target.length());
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�");
		}
	}
	
}


