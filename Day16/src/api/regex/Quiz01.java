package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String idCheck = "^[a-zA-Z1-9]{8,20}$";
		String pwCheck = "^[a-zA-Z1-9!@#$]{8,20}$";
		String nameCheck = "^[��-�R]{2,7}$";
		
		String id, pw, name;
		
		while(true) {
			System.out.print("���̵� �Է� : ");
			id = s.next();
			if(Pattern.matches(idCheck, id)) {
				System.out.println("�ùٸ� ���̵��Դϴ�.");
				break;
			}
			else
				System.out.println("�߸��� ���̵� �����Դϴ�.");
		}
		
		while(true) {
			System.out.print("\n��й�ȣ �Է� : ");
			pw = s.next();
			
			if(Pattern.matches(pwCheck, pw)) {
				System.out.println("�ùٸ� ��й�ȣ�Դϴ�.");
				break;
			}
			else
				System.out.println("�߸��� ��й�ȣ �����Դϴ�.");
		}
		
		while(true) {
			System.out.print("\n�̸� �Է� : ");
			name = s.next();
			
			if(Pattern.matches(nameCheck, name)) {
				System.out.println("�ùٸ� �̸��Դϴ�.");
				break;
			}
			else
				System.out.println("�߸��� �̸� �����Դϴ�.");
		}
		
		s.close();
	}

}
