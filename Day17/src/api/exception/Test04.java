package api.exception;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//��� ���ܴ� Exception���� ó���� �����ϴ�.
		// - ��, Java�� �𸣴� ���ܴ� �츮�� ������ ó�����־�� �Ѵ�.
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("���� ������ ������ ������� �Է�");
			int a = s.nextInt();
			int b = s.nextInt();
			
			//���� ���� �߻� : ��ǻ�Ͱ� �𸣴� ��Ȳ������ throw�� ���� catch�� �̵�
			if(a<0||b<0) {
				throw new Exception();
			}
			
			s.close();
			
			System.out.println("�ѻ���� �� �� �ִ� ���� �� : "+a/b);
		}
		catch(Exception e) {
			e.printStackTrace();//���߿�
		}
	}

}
