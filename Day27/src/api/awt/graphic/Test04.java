package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window04 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private class CanvasEx extends Canvas {
		private Image img = Toolkit.getDefaultToolkit().getImage("image/cat.jpg");
		private int x = 10, y = 10, width = 200, height = 150;
		
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, x, y, width, height, this);
		}
		
		public void increase() {
			this.width += 30;
			this.height += 30;
			if(this.width > 400) this.width = 400;
			if(this.height > 400) this.height = 400;
			this.repaint();
		}
		
		public void decrease() {
			this.width -= 30;
			this.height -= 30;
			if(this.width < 50) this.width = 50;
			if(this.height < 50) this.height = 50;
			this.repaint();
		}
	}
	//������ Ŭ������ �ν��Ͻ��� ����
	private CanvasEx can = new CanvasEx();
	
	
	private Panel panel = new Panel();
	private Button increase = new Button("Ȯ��");
	private Button decrease = new Button("���");
	private Button exit = new Button("����");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(can, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(increase);
		panel.add(decrease);
		panel.add(exit);
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
		
		//��ư�� �̺�Ʈ ����
		increase.addActionListener(e->{
			can.increase();
		});
		decrease.addActionListener(e->{
			can.decrease();
		});
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window04() {
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

public class Test04 {
	public static void main(String[] args) {
		Window04 a = new Window04();	//â ����
	}
}
