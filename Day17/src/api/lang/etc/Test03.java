package api.lang.etc;

public class Test03 {

	public static void main(String[] args) {
		//MathŬ����	���� ��� ���� Ŭ����
		
//		Math m = new Math();
		
		System.out.println(Math.random());
		
		System.out.println(Math.pow(2, 10));	//2�� 10��
		System.out.println(Math.sqrt(9));		//��Ʈ 9
		
		System.out.println(Math.round(1.5));	//�ݿø�
		System.out.println(Math.ceil(1.5));		//�ø�
		System.out.println(Math.floor(1.5));	//����
		System.out.println((int)1.5);			//����
		
		System.out.println(Math.abs(-5));		//���밪 (�ַ� ���̸� ���� �� ���)
		
		System.out.println(Math.PI);			//������
		System.out.println(Math.E);				//�ڿ����� e
		
		int bottom = 3, height = 4;
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);
		double res = Math.sqrt(result);
		
		System.out.println(res);
	}

}
