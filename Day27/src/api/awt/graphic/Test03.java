package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window03 extends Frame{
	
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

	private Panel panel = new Panel();
	private Button big = new Button("Ȯ��");
	private Button small = new Button("���");
	private Button exit = new Button("����");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(new BorderLayout());

		this.add(can, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout());
		panel.add(big);
		panel.add(small);
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
		
		ActionListener setBig = e->{
			if(width<=can.getWidth() && height<=can.getHeight()) {
				width+=30;
				height+=30;
				can.repaint();
			}
		};
		big.addActionListener(setBig);
		
		ActionListener setSmall = e->{
			if(width>75 && height>50) {
				width-=30;
				height-=30;
				can.repaint();
			}
		};
		small.addActionListener(setSmall);
		
		ActionListener setExit = e->{
			System.exit(0);
		};
		exit.addActionListener(setExit);
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window03() {
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

public class Test03 {
	public static void main(String[] args) {
		Window03 a = new Window03();	//â ����
	}
}
