package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window07 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt1 = new Button("��ư1");
	private Button bt2 = new Button("��ư2");
	private Button bt3 = new Button("��ư3");
	private Button bt4 = new Button("��ư4");
	
	private GridLayout grid = new GridLayout(2, 2);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(grid);
		
		this.add(bt1);	//this(â)�� bt�� �߰��ϰڽ��ϴ�.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
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
	
	public Window07() {
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

public class Test07 {

	public static void main(String[] args) {
		Window07 a = new Window07();	//â ����
	}

}
