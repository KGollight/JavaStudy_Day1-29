package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window10 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt1 = new Button("���缮");
	private Button bt2 = new Button("�ڸ��");
	private Button bt3 = new Button("������");
	private Button bt4 = new Button("����");
	private Button bt5 = new Button("�缼��");
	
	private BorderLayout border = new BorderLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(border);
		
		this.add(bt1, BorderLayout.CENTER);
		this.add(bt2, BorderLayout.NORTH);
		this.add(bt3, BorderLayout.WEST);
		this.add(bt4, BorderLayout.EAST);
		this.add(bt5, BorderLayout.SOUTH);
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
	
	public Window10() {
		display();
		event();
		menu();
		
		// ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ"); 		// â ����
		setLocation(650, 350); 		// x�� : 650, y�� : 350 (���� �� �𼭸� ����)
		setSize(300, 200); 			// �� : 300, ���� : 200
		setResizable(false); 		// â ũ�� ���� ����

		setVisible(true); 			// ȭ�� ǥ��
	}
}

public class Test10 {

	public static void main(String[] args) {
		Window10 a = new Window10();	//â ����
	}

}
