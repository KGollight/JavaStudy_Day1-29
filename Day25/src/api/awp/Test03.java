package api.awp;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window03 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt = new Button("��ư");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(bt);	//this(â)�� bt�� �߰��ϰڽ��ϴ�.
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
	
	public Window03() {
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

public class Test03 {

	public static void main(String[] args) {
		Window03 a = new Window03();	//â ����
	}

}
