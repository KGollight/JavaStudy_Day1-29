package api.thread;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
		
//		��Ƽ�����尡 �ʿ��� ���� (= �̱� �����尡 ������ ����)
//		[�ڵ�1] ����ڿ��� �˸�â�� ���� �ڵ�
//		[�ڵ�2] 1���� 100���� 1�ʰ������� ����ϴ� �ڵ�
		
//		�̱۽������̹Ƿ� ���������� ����
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ���");
		
		for(int i=1; i<=100; i++) {
			System.out.println("i = "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
