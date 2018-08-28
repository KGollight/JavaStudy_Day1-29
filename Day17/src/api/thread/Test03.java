package api.thread;

import javax.swing.JOptionPane;

public class Test03 {

	public static void main(String[] args) {
//		스레드를 생성하여 구동
//		 -> t.start()	생성된 t라는 스레드를 구동하는 명령
//		[문제점]	main이 끝나도 t는 종료되지 않는다
//		[해결책] t를 main에 종속되도록 설정(daemon)
		
		Thread t = new Thread() {
			public void run() {
				for(int i=1; i<=100; i++) {
					System.out.println("i = "+i);
					
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		
		JOptionPane.showMessageDialog(null, "안녕하세요");
		
		System.out.println("프로그램 종료");
	}

}
