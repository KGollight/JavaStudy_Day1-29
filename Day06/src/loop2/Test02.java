package loop2;

public class Test02 {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� 'Ư�� ����'���� �ݺ��� ����
		// -> 1~10������ ���������� ��÷�Ͽ� 7�� ������ ����
		
		while(true) {
			int a = (int)(Math.random()*10)+1;
			System.out.println("a = "+a);
			
			if(a==7) {
				break;
			}
		}
	}

}
