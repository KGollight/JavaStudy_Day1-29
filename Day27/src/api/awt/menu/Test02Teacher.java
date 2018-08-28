package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window02t extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private TextArea area = new TextArea();
	
	private MenuBar bar = new MenuBar();
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	
	private MenuItem create = new MenuItem("���� �����");
	private MenuItem exit = new MenuItem("�����ϱ�");
	
	private Menu font = new Menu("�۲�");
	private MenuItem big = new MenuItem("5pt ũ��");
	private MenuItem small = new MenuItem("5pt �۰�");
	
	private Menu color = new Menu("����");
	private MenuItem black = new MenuItem("����");
	private MenuItem red = new MenuItem("����");
	private MenuItem blue = new MenuItem("�Ķ�");
	
	private int size = 10;
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(area);
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
		
		//�޴� �̺�Ʈ ó��
		ActionListener listener = e->{
			if(e.getSource() == create) {
				area.setText("");
			}
			else if(e.getSource() == exit) {
				System.exit(0);
			}
			else if(e.getSource() == black) {
				area.setForeground(Color.black);
			}
			else if(e.getSource() == red) {
				area.setForeground(Color.red);
			}
			else if(e.getSource() == blue) {
				area.setForeground(Color.blue);
			}
			else if(e.getSource() == big) {
				size += 5;
				if(size > 150) size = 150;
				Font font = new Font("", Font.PLAIN, size);
				area.setFont(font);
			}
			else if(e.getSource() == small) {
				size -= 5;
				if(size < 5) size = 5;
				Font font = new Font("", Font.PLAIN, size);
				area.setFont(font);
			}
		};
		create.addActionListener(listener);
		exit.addActionListener(listener);
		black.addActionListener(listener);
		red.addActionListener(listener);
		blue.addActionListener(listener);
		big.addActionListener(listener);
		small.addActionListener(listener);
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		this.setMenuBar(bar);
		
		bar.add(file);
		bar.add(edit);
		
		file.add(create);
		file.add(exit);
		
		edit.add(color);
		edit.add(font);
		
		color.add(black);
		color.add(red);
		color.add(blue);
		
		font.add(big);
		font.add(small);
	}
	
	public Window02t() {
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

public class Test02Teacher {
	public static void main(String[] args) {
		Window02t a = new Window02t();	//â ����
	}
}
