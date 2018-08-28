package api.Thread;

public class Timer extends Thread {
	
	private boolean flag = true;
	
	public void kill() {
		flag = false;
	}
	
	public void run() {
		for(int i=100; flag && i>0; i--) {
			System.out.println("countdown = "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
