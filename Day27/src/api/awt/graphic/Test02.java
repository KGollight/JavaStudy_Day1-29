package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window02 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Image img = Toolkit.getDefaultToolkit().getImage("image/cat.jpg");
	private int x = 10, y = 10, width = 200, height = 150;
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, x, y, width, height, this);
		}
	};
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(can);
	}
	
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void event() {
		//x ��ư�� ������ â�� �����ϴ� �̺�Ʈ ����
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(w);
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window02() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(500, 200);	//x : 500, y : 200	(���� �� �𼭸� ����)
		setSize(600, 500);			//�� : 600 , ���� : 500
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
		
		walk();
	}
	
	public void walk() {
//		�̵��� �����ϱ� ���� �ؾ��� �۾�
//		[1] ��ǥ�� ���� -> [2] �ٽ� �׷���
		while(true) {
			x++;
			System.out.println("x = "+x);
			
			if(x>=can.getWidth()+10)
				break;
			
			can.repaint();//paint()�� �ٽ� �����ϼ���
			try {
				Thread.sleep(100);
			} catch (Exception e) {	}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//â ����
	}
}
