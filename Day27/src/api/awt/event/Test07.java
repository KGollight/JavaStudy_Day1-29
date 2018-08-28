package api.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import api.awt.event.*;

//18���� ���� - �ڵ��� ���� ��ư �����

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window07 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("", Label.RIGHT);
	
	private Panel panel = new Panel();
	private Button[] bt = new Button[15];
	private String[] title = new String[] {
		"1","2","3","4","5","6","7","8","9","*","0","#","�����","��ȭ","��ü����"
	};
	
	private StringBuffer sb = new StringBuffer();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
//		������ : BorderLayout
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
//		lb.setPreferredSize(new Dimension(this.getWidth(), 100));
		
//		panel : GridLayout
		panel.setLayout(new GridLayout(5, 3));
		for(int i=0; i < bt.length; i++) {
			bt[i] = new Button(title[i]);
			panel.add(bt[i]);
		}
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
		
		//[1] ��ȣ �е忡 ���� �̺�Ʈ ����
		//[2] ����⿡ ���� �̺�Ʈ ����
		//[3] ��ȭ�� ���� �̺�Ʈ ����
		//[4] ��ü������ ���� �̺�Ʈ ����
		
		ActionListener a = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				�˾Ƴ����� ���� : ���� ��ư�� �����°�...(��ư�� ������ ����)
//				(1) ActionEvent���� �ִ� e.getActionCommand() ���
//				System.out.println(e.getActionCommand());
//				(2) e.getSource()�� ��ư�� �� �� ���� ����
//				Button btn = (Button) e.getSource();
//				System.out.println(btn.getLabel());
				
				addText(e.getActionCommand());
			}
		};
		
		for(int i=0; i < 12; i++) {
			bt[i].addActionListener(a);
		}
		
		ActionListener b = e->{
			if(sb.length() > 0) {
				removeLastText();
			}
		};
		bt[12].addActionListener(b);
		
		ActionListener c = e->{
			clearText();
		};
		bt[14].addActionListener(c);
		
	}
	
	public void clearText() {
		sb = new StringBuffer();
		lb.setText(sb.toString());
	}
	
	public void removeLastText() {
		sb.deleteCharAt(sb.length() - 1);
		lb.setText(sb.toString());
	}
	
	public void addText(String text) {
		sb.append(text);
		lb.setText(sb.toString());
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window07() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(100, 200);	//x : 100, y : 200	(���� �� �𼭸� ����)
		setSize(500, 400);			//�� : 500 , ���� : 400
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test07 {
	public static void main(String[] args) {
		Window07 a = new Window07();	//â ����
	}
}
