package loop3;

public class Quiz05 {

	public static void main(String[] args) {
		/* �Ǻ���ġ ����
		 * 1��°�� 2��°�� 1�� ����
		 * 3��°���� ���� 2�ڸ� ������ �հ�� ����
		 * 20��° �ڸ��� ���� ȭ�鿡 ���
		 * */
		int m=1; // ù��° �ڸ�
		int n=1; // 2��° �ڸ�
		int s=0; // 3��° �ڸ�
		
		for(int i=1; i<=20; i++) {
			if(i<=2) {
				s=1;
			}
			else {
				s=n+m;
				m=n;
				n=s;
			}
		}
		System.out.println("20��° �ڸ� �� : "+s);
	}

}
