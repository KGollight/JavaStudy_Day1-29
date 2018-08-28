package api.exception;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//close()�� �� �ʿ��ϴٸ� �ڵ� close()�� �����ϴ� try~catch�� ���
		// -> �׻� ����ϴ°� �ƴ϶� close()�� �ʿ��� ��쿡�� ���
		// -> try()�ȿ� ������ �ν��Ͻ��� try���� �� �ڵ����� close()�� ����

		
		
		try(Scanner s = new Scanner(System.in);) {
			
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
	}

}
