package loop3;

public class Quiz01 {

	public static void main(String[] args) {
		// 1���� 100������ ����
		for(int num=1; num<=100; num++) {
			System.out.println("num = "+num);
		}
		// 1���� 100������ Ȧ��
		for(int sol=1; sol<=100; sol+=2) {
			System.out.println("sol = "+sol);
		}
		// ���ĺ� �빮��
		for(char s = 'A'; s<='Z'; s++) {
			System.out.println("���ĺ� �빮�� : "+s);
		}
		// 1000�̸��� 2�� ������
		for(int mul = 1; mul<1000; mul*=2) {
			System.out.println("2�� ������ : "+mul);
		}
		// 10���� ī��Ʈ�ٿ�
		for(int count=10; count>=0; count--) {
			System.out.println("ī��Ʈ�ٿ� : "+count);
		}
		
		/* ���� ����
		 * [1] �ݺ����� �ڷ����� ����
		 * [2] ������ ������ ����
		 * [3] �Ǽ��� �ݺ����� �������� �ʴ�.(��Ȯ���� ������)
		 * */
		for(double i = 0.01; i<=1; i+=0.01) {
			System.out.println(i);
		}
	}

}
