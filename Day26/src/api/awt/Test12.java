package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window12 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("�����Ͻðڽ��ϱ�?", Label.CENTER);
	private Button yes = new Button("��");
	private Button no = new Button("�ƴϿ�");
	
	//�г� : ���̾ƿ� ������ ������ ������ ������Ʈ
	private Panel panel = new Panel();
	
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout(1, 2);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(border);
		
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		panel.setLayout(grid);
		panel.add(yes);
		panel.add(no);
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
	
	public Window12() {
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

public class Test12 {

	public static void main(String[] args) {
		Window12 a = new Window12();	//â ����
	}

}
