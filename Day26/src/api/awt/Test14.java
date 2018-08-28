package api.awt;

import java.awt.*;
import java.awt.event.*;

class MyPanel2 extends Panel{
	private Button[] bt = new Button[16];
	private String[] name = new String[] {
		"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "%", "/"	
	};
	
	private GridLayout grid = new GridLayout(4, 4);
	
	public MyPanel2() {
		this.setLayout(grid);
		
		Font font = new Font("����", Font.ITALIC, 20);
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button(name[i]);
			bt[i].setForeground(Color.yellow);
			bt[i].setBackground(Color.BLACK);
			bt[i].setFont(font);
			this.add(bt[i]);
		}
	}
}

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window14 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("���� test", Label.RIGHT);
	
	private MyPanel2 panel = new MyPanel2();
	
	private BorderLayout border = new BorderLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(border);
		
		Font font = new Font("����", Font.ITALIC, 50);
		lb.setFont(font);
		
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void event() {
		
	}
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window14() {
		display();
		event();
		menu();
		
		// ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ"); 		// â ����
		setLocation(500, 200); 		// x�� : 500, y�� : 200 (���� �� �𼭸� ����)
		setSize(600, 500); 			// �� : 600, ���� : 500
		setResizable(false); 		// â ũ�� ���� ����

		setVisible(true); 			// ȭ�� ǥ��
	}
}

public class Test14 {

	public static void main(String[] args) {
		Window14 a = new Window14();	//â ����
	}

}
