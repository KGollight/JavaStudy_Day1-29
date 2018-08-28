package api.awt.event;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window01 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt = new Button("������!");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		//this.setLayout(border);
		this.add(bt/*, BorderLayout.CENTER*/);
	}
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void event() {
		//��ư�� ������ ������ ��¸޼��� �ڵ尡 ����ǵ��� ����
		
		//ó�� �ν��Ͻ� ����
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("�׽�Ʈ!");
				System.exit(0);
			}
		};
		bt.addActionListener(listener);
	}
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window01() {
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

public class Test01 {

	public static void main(String[] args) {
		Window01 a = new Window01();	//â ����
	}

}
