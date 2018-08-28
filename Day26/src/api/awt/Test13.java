package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Panel�� Ȯ���� Ŭ����
 */
class Mypanel extends Panel{
	private Button yes = new Button("��");
	private Button no = new Button("�ƴϿ�");
	
	private GridLayout grid = new GridLayout(1, 2);
	
	public Mypanel() {
		this.setLayout(grid);
		this.add(yes);
		this.add(no);
	}
}

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window13 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("�����Ͻðڽ��ϱ�?", Label.CENTER);
	
	//�г� : ���̾ƿ� ������ ������ ������ ������Ʈ
	private Mypanel panel = new Mypanel();
	
	private BorderLayout border = new BorderLayout();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(border);
		
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
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
	
	public Window13() {
		display();
		event();
		menu();
		
		// ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ"); 		// â ����
		setLocation(500, 200); 		// x�� : 500, y�� : 200 (���� �� �𼭸� ����)
		setSize(600, 500); 			// �� : 600, ���� : 500
		setResizable(false); 		// â ũ�� ���� ����

		setVisible(true); 			// ȭ�� ǥ��
	}
}

public class Test13 {

	public static void main(String[] args) {
		Window13 a = new Window13();	//â ����
	}

}
