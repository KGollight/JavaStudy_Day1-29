package api.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window09 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button[] bt = new Button[12];
	private String[] title = new String[] {
			"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"
	};
	
	private GridLayout grid = new GridLayout(4, 3);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(grid);
		
		Font font = new Font("�ü�", Font.ITALIC, 15);
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button(title[i]);
			bt[i].setBackground(Color.black);
			bt[i].setForeground(Color.CYAN);
			this.add(bt[i]);
		}
		
		this.setBackground(Color.red);
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
	
	public Window09() {
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

public class Test09 {

	public static void main(String[] args) {
		Window09 a = new Window09();	//â ����
	}

}
