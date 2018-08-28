package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window01 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
//	�׸��� �׸� �� �ִ� ��ȭ�� ���� Ŭ����
//	���� Canvas�� �ƴϴ��� ��� ������Ʈ�� �׸��� �׸� �� �ִ�
	
//	�׸��� �׸��� ���� �����ϴ� ������ ����(�������Ͽ� ���)
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			//g			: ��
			//this(can)	: ��ȭ��(Canvas)
			g.drawLine(50, 50, 150, 50);
			g.drawRect(50, 100, 100, 100);
			g.drawOval(50, 100, 100, 100);
			
			g.setColor(Color.blue);
			g.setFont(new Font("�ü�", Font.BOLD, 30));
			
			g.drawString("Hello Graphic", 100, 250);
			
			//�̹���
			Image img = getToolkit().getDefaultToolkit().getImage("image/cat.jpg");
			g.drawImage(img, 50, 50, 200, 150, this);
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
	
	public Window01() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(500, 200);	//x : 500, y : 200	(���� �� �𼭸� ����)
		setSize(600, 500);			//�� : 600 , ���� : 500
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test01 {
	public static void main(String[] args) {
		Window01 a = new Window01();	//â ����
	}
}
