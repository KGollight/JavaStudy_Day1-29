package api.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//Scanneró�� �ݵ�� close�� �Ǿ�� �ϴ� �͵��� ���� �߻� ���ο� ������� ó���� �� �ֵ��� �����ؾ� �Ѵ�.
		//finally	-> �ʼ��� �ƴ����� �ۼ��� ��� try������ ����Ǹ� ������ �����
		//			-> ����� �ڿ����������ϴ� �ڵ带 ���

		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.println("���� ������ ������ ������� �Է�");
			int a = s.nextInt();
			int b = s.nextInt();
			
			//���� ���� �߻� : ��ǻ�Ͱ� �𸣴� ��Ȳ������ throw�� ���� catch�� �̵�
			if(a<0||b<0) {
				throw new Exception();
			}
			
			System.out.println("�ѻ���� �� �� �ִ� ���� �� : "+a/b);
		}
		catch(Exception e) {
			e.printStackTrace();//���߿�
		}
		finally {
			System.out.println("��ĳ�ʸ� �����մϴ�.");
			s.close();
		}
	}

}
