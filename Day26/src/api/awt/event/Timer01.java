package api.awt.event;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Timer01 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("## �޴� ##");
			System.out.println("1. ����");
			System.out.println("2. ����");
			
			int choice = s.nextInt();
			
			
			if(choice == 1) {
				Runnable timer = ()->{
					long time = 0L;
					while(true) {
						time += 10;
						System.out.println("time = "+time);
						try {
							Thread.sleep(10);
						}catch(Exception e) {}
					}
				}; 
				Thread t = new Thread(timer);
				t.start();
				
				JOptionPane.showMessageDialog(null, "�����Ϸ��� Ȯ���� ��������");
				t.stop();
			}
			else if(choice == 2) break;
		}
		
		s.close();
		
	}
}
