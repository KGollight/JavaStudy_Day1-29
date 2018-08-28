package api.thread;

import javax.swing.JOptionPane;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Thread t = new Thread() {
			public void run() {
				int num1 = (int)(Math.random()*8)+2;
				int num2 = (int)(Math.random()*9)+1;

				String str = JOptionPane.showInputDialog(num1+" x "+num2+" = ");
				int result = Integer.parseInt(str);
				
				if(num1*num2==result)
					System.out.println("정답!");
				else
					System.out.println("오답!");
			}
		};
		t.setDaemon(true);
		t.start();
		
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
