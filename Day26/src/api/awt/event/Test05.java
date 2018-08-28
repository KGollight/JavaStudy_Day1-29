package api.awt.event;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window05 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Button bt = new Button("��������!");
	
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(bt);
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
		
		
		MouseListener m = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println("mouseClicked");
//				�߻��� �̺�Ʈ�� �� ������ �м�?
				System.out.println(e);
				System.out.println(e.getButton());//��� ���콺 ��ư�� �����°�?
				System.out.println(e.getWhen());//���� �����°�?
				System.out.println(e.getClickCount());//��� ���� Ŭ���ߴ°�?
				
				System.out.println(e.getSource());//�� �����°�?
				System.out.println(bt);
				System.out.println(e.getSource() == bt);
			}
		};
		bt.addMouseListener(m);
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window05() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(100, 200);	//x : 100, y : 200	(���� �� �𼭸� ����)
		setLocation(500, 200); 		// x�� : 500, y�� : 200 (���� �� �𼭸� ����)
		setSize(600, 500); 			// �� : 600, ���� : 500
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test05 {
	public static void main(String[] args) {
		Window05 a = new Window05();	//â ����
	}
}
