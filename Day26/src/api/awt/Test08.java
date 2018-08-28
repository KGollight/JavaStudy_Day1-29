package api.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window08 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt1 = new Button("1");
	private Button bt2 = new Button("2");
	private Button bt3 = new Button("3");
	private Button bt4 = new Button("4");
	private Button bt5 = new Button("5");
	private Button bt6 = new Button("6");
	private Button bt7 = new Button("7");
	private Button bt8 = new Button("8");
	private Button bt9 = new Button("9");
	private Button bt10 = new Button("*");
	private Button bt11 = new Button("0");
	private Button bt12 = new Button("#");
	
	private GridLayout grid = new GridLayout(4, 3);
	private Font font = new Font("�ü�", Font.ITALIC, 15);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(grid);
		
		this.add(bt1);	//this(â)�� bt�� �߰��ϰڽ��ϴ�.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		this.add(bt9);
		this.add(bt10);
		this.add(bt11);
		this.add(bt12);
		
		this.setFont(font);
		this.setBackground(Color.white);
		this.setForeground(Color.cyan);
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
	
	public Window08() {
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

public class Test08 {

	public static void main(String[] args) {
		Window08 a = new Window08();	//â ����
	}

}
