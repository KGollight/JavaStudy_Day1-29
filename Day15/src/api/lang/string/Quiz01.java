package api.lang.string;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		String[] dbId = new String[] {"kgitbank", "teacher", "student"};
		String[] dbPw = new String[] {"master", "java", "java"};
		
		Scanner s = new Scanner(System.in);
		System.out.println("***���̵�� ��й�ȣ�� �Է��ϼ���***");
		System.out.print("ID : ");
		String id = s.next();
		System.out.print("PW : ");
		String pw = s.next();
		
		s.close();
		
		int count=0;
		for(int i=0; i<id.length(); i++) {
			if(id.equals(dbId[i]) && pw.equals(dbPw[i])) {
				count++;
				break;
			}
		}
		
		if(count>0)
			System.out.println("�α��� ����!");
		else
			System.out.println("�α��� ����...");
		
//		if(id.equals("kgitbank") && pw.equals("master")) {
//			System.out.println("�α��� ����!");
//		}
//		else if(id.equals("teacher") && pw.equals("java")) {
//			System.out.println("�α��� ����!");
//		}
//		else if(id.equals("student") && pw.equals("java"))
//			System.out.println("�α��� ����!");
//		else
//			System.out.println("�α��� ����...");
	}

}
