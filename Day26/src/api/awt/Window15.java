package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
public class Window15 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("", Label.RIGHT);
	
	private ButtonPanel panel = new ButtonPanel();
	
	private BorderLayout layout = new BorderLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(layout);
		
		Font font = new Font("����", Font.BOLD, 30);
		lb.setFont(font);
		lb.setText("���ڸ� �Է��ϼ���");
		
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void event() {
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window15() {
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