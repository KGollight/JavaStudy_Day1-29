package api.awp;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window06 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt1 = new Button("��");
	private Button bt2 = new Button("�ƴϿ�");
	private Button bt3 = new Button("���");
	
	private FlowLayout flow = new FlowLayout(FlowLayout.RIGHT, 50, 100);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(flow);
		
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
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
	
	public Window06() {
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

public class Test06 {

	public static void main(String[] args) {
		Window06 a = new Window06();	//â ����
	}

}
