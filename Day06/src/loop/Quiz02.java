package loop;

public class Quiz02 {

	public static void main(String[] args) {
		// ��ȭ Ȯ��ǥ
		// ���� : 20% / ���� : 80%
		// ���� �� �۷��� 1����, ���н� ����
		// 0�� �� 50�� ��ȭ�ϸ� ���?
		int level = 0;
		int times = 1;
		
		while (times<=50) {
			System.out.println(times+"ȸ �õ��ϼ̽��ϴ�.");
			
			int inchant = (int)(Math.random()*100);
			
			if(inchant<20) {
				level+=1;
				System.out.println("��ȭ ����! ���� ������ ���� : "+level);
			}
			else
				System.out.println("��ȭ�� �����ϼ̽��ϴ�.");

			times++;
		}
	}

}
