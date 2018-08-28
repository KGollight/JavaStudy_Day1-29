package api.awt.extend;

import java.awt.*;
import java.awt.event.*;

class Dialog01 extends Dialog{

	private void display() {}
	private void event() {
		//Dialog�� ����� �� ��F�� ó���ؾ� �ϴ°�?
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);		//���α׷� ����
//				setVisible(false);	//����
				dispose();			//���� â�� �Ҹ�
			}
		};
	}
	private void menu() {}
	
	public Dialog01(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		display();
		event();
		menu();
		
		setLocation(600, 200);
		setSize(300, 400);
		setResizable(false);
//		setVisible(true);
	}
}

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window01 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Dialog sub = new Dialog(this, "����", false);//true : ���� �Ұ�, false : ���� ����
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		
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
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window01() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(500, 200);	//x : 500, y : 200	(���� �� �𼭸� ����)
		setSize(600, 500);			//�� : 600 , ���� : 500
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��

//		setVisible(true);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Window01 a = new Window01();	//â ����
	}
}
