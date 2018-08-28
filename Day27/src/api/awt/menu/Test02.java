package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window02 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private MenuBar bar = new MenuBar();
	
	private Menu file = new Menu("����");
	private MenuItem create = new MenuItem("���θ����");
	private MenuItem exit = new MenuItem("�����ϱ�");
	
	private Menu edit = new Menu("����");
	
	private Menu color = new Menu("����");
	private MenuItem black = new MenuItem("����");
	private MenuItem red = new MenuItem("����");
	private MenuItem blue = new MenuItem("�Ķ�");
	
	private Menu style = new Menu("�۲�");
	private MenuItem big = new MenuItem("5pt ũ��");
	private MenuItem small = new MenuItem("5pt �۰�");
	
	private TextArea area = new TextArea();
	private FlowLayout flow = new FlowLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(flow);
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
		
//		���� ���� ����
		ActionListener setBlack = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.black);
			}
		};
		black.addActionListener(setBlack);
		
		ActionListener setRed = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		};
		red.addActionListener(setRed);
		
		ActionListener setBlue = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.blue);
			}
		};
		blue.addActionListener(setBlue);
		
//		���� ũ�� ����
		ActionListener setBig = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int size = area.getFont().getSize();
				int big = size+5;
				Font font = new Font("����", Font.PLAIN, big);
				area.setFont(font);
			}
		};
		big.addActionListener(setBig);
		
		ActionListener setSmall = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int size = area.getFont().getSize();
				int small = size-5;
				Font font = new Font("����", Font.PLAIN, small);
				area.setFont(font);
			}
		};
		small.addActionListener(setSmall);
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
		color.add(black);
		color.add(red);
		color.add(blue);
		
		edit.add(style);
		style.add(big);
		style.add(small);
	}
	
	public Window02() {
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

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//â ����
	}
}
