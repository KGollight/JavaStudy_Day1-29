package api.Thread;

import javax.swing.JOptionPane;

public class Thes11 {

	public static void main(String[] args) {
//		������ ���� ����
		
		Runnable r = ()->{
			for(int i=100; i>0; i--) {
				System.out.println("countdown = "+i);
				
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		JOptionPane.showMessageDialog(null, "�޽���");
		//���Ӱ�� ���� ���·� ���� ������ �����Ѱ�?
//		t.stop();
//		t.interrupt();
	}

}
