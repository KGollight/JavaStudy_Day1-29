package api.exception;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//����(Exception)		���� �� �߻��ϴ� ���߻�Ȳ
		//[1] b�� 0�� �Է��ϸ� ���� �߻�(java.lang.ArithmeticException)
		//[2] int�� �ƴ� �ٸ� ���� �Է��Ѵٸ� ���� �߻�(java.util.InputMismatchException)
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�������� ���ڸ� �Է�");
		int a = s.nextInt();
		int b = s.nextInt();
		
		s.close();
		
		System.out.println("��� : "+a/b);
	}

}
