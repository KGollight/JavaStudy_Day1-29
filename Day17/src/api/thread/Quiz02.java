package api.thread;

import javax.swing.JOptionPane;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		Gugudan g = new Gugudan();
		g.setDaemon(true);
		g.start();
		
		for(int i=5; i>0; i--) {
			System.out.println("���� �ð� : "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ÿ�� ����!!!");
		
		System.exit(0);
	}

}
