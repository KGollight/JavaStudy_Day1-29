package api.util.scanner;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		Scanner Ŭ����	�Է� ����
//						ǥ���Է����, ���ڿ�, ����, Ȩ������
		
//		.next()			�ܾ �Է¹޴� ���
//		.hasNext()		�����ִ� �ܾ �����ϴ��� Ȯ���ϴ� ���
//		.nextLine()		����(��)�� �Է¹޴� ���
//		.hasNextLine()	�����ִ� ������ �����ϴ��� Ȯ���ϴ� ���
		
		String str = "�� �ڵ��� ���峭 8�� Ʈ��\n���λ��� ������ �ߵ���";
		System.out.println(str);
		
		Scanner s1 = new Scanner(str);
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		s1.close();
		
		Scanner s2 = new Scanner(str);
		while(s2.hasNextLine()) {
			System.out.println(s2.nextLine());
		}
		s2.close();
	}

}
