package array;

public class Test03 {

	public static void main(String[] args) {
		// �������� �ζǹ�ȣ ��÷
		// 1~45���� 6��, �ߺ��� �Ű澵 �ʿ� ����
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print("<"+lotto[i]+">");
		}
	}

}
