package api.thread;

import javax.swing.JOptionPane;

public class Gugudan extends Thread {
	//run ������
	public void run() {
		int num1 = (int)(Math.random()*8)+2;
		int num2 = (int)(Math.random()*9)+1;

		String str = JOptionPane.showInputDialog(num1+" x "+num2+" = ");
		int result = Integer.parseInt(str);
		
		if(num1*num2==result)
			System.out.println("����!");
		else
			System.out.println("����!");
	}
}
