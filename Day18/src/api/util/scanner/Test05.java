package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) throws FileNotFoundException {
		//����ڿ��� ���̵� �� ��й�ȣ�� �Է¹޴� �ڵ�
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���̵� / ��й�ȣ �Է�");
		String id = keyboard.nextLine();
		String pw = keyboard.nextLine();
		keyboard.close();
		
		//������ ���� ������ �о���� �ڵ�
		File file = new File("member.db");
		Scanner s = new Scanner(file);

		boolean loginFlag = false;
		while(s.hasNextLine()) {
			String line = s.nextLine();
//			System.out.println("line = "+line);
			String[] data = line.split("/");
//			data[0] : ID , data[1] : password
			
			if(id.equals(data[0]) && pw.equals(data[1])) {
				loginFlag = true;
				break;
			}
			
		}
		
		s.close();
		
		//���� ��� ���
		System.out.println("��� : "+loginFlag);
		if(loginFlag) {
			System.out.println(id+"���� �α��� �ϼ̽��ϴ�");
		}
		else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�");
		}
	}
}
