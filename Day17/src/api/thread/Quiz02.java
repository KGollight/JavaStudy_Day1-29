package api.thread;

import javax.swing.JOptionPane;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		Gugudan g = new Gugudan();
		g.setDaemon(true);
		g.start();
		
		for(int i=5; i>0; i--) {
			System.out.println("남은 시간 : "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("타임 오버!!!");
		
		System.exit(0);
	}

}
