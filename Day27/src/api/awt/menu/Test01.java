package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window01 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private MenuBar bar = new MenuBar();
	
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	
	private MenuItem create = new MenuItem("���� �����");
	private MenuItem open = new MenuItem("����");
	private MenuItem save = new MenuItem("����");
	private MenuItem exit = new MenuItem("����");
	
	private Menu view = new Menu("����");
	private MenuItem big = new MenuItem("ũ��");
	private MenuItem normal = new MenuItem("����");
	private MenuItem small = new MenuItem("�۰�");
	
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
//		this.add(bar);
		this.setMenuBar(bar);
		
		bar.add(file);
		bar.add(edit);
		
		file.add(create);
		file.addSeparator();//���м�
		file.add(open);
		file.add(save);
		file.addSeparator();//���м�
		file.add(exit);
		
		edit.add(view);
		view.add(big);
		view.add(normal);
		view.add(small);
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
	}
}

public class Test01 {
	public static void main(String[] args) {
		Window01 a = new Window01();	//â ����
	}
}
