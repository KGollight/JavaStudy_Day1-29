package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//�߻��ϴ� �� ������ ���ܸ� try~catch �������� �ذ�
		//try		-> ������ ����
		//catch		-> ���� �߻� �� ���� �̵��� ����
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("�������� ���ڸ� �Է�");
			int a = s.nextInt();
			int b = s.nextInt();
			
			s.close();
			
			System.out.println("��� : "+a/b);
		}
		catch(InputMismatchException e) {
			//���� �޽��� ��� �� ���� �ۼ�
			System.out.println("���� �Է� ������");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������ �ǰڳ�");
		}
	}

}
