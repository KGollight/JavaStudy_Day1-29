package loop3;

public class Test01 {

	public static void main(String[] args) {
		// for ����, ����, ������ �� �� �ִ� �ڸ��� �ִ� �ݺ���
		// [1] while���� �̿��Ͽ� 10ȸ �ݺ�
		//		- �ڸ��� ��Ű�� �ʾƵ� ������ ���� ����
		//		- �ݺ����� ��� ������
		int n = 1;
		while(n<=10) {
			System.out.println("n = "+n);
			n++;
		}
		
		// [2] for���� �̿��Ͽ� 10ȸ �ݺ�
		// for(1:2:3) { �ڵ� }
		// - Ƚ�� �ݺ� �Ǵ� ���� �ݺ��� Ưȭ��
		for(int i=1; i<=10; i++) {
			System.out.println("i = "+i);
		}
	}

}
