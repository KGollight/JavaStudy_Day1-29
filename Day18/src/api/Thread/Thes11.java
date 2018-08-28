package api.Thread;

import javax.swing.JOptionPane;

public class Thes11 {

	public static void main(String[] args) {
//		스레드 강제 정지
		
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
		
		JOptionPane.showMessageDialog(null, "메시지");
		//종속계약 없는 상태로 강제 정지가 가능한가?
//		t.stop();
//		t.interrupt();
	}

}
