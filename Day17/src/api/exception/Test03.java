package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//���� �� ������ �����Ͽ� ó��(����� �θ� Ŭ����)
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("�������� ���ڸ� �Է�");
			int a = s.nextInt();
			int b = s.nextInt();
			
			s.close();
			
			System.out.println("��� : "+a/b);
		}
		catch(RuntimeException e) {
			System.out.println("������ ������ϴ�.");
			//���� ������ e�� �м��Ͽ� ������ ������ �ľ�
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			
			//stacktrace�� Ȯ���ϰ� ���� ��쿡��
			e.printStackTrace();
		}
	}

}
