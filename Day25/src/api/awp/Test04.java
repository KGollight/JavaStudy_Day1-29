package api.awp;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window04 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private Label lb = new Label("�� �׽�Ʈ~!", Label.CENTER);
	
	//�۲� �ν��Ͻ�
	private Font font = new Font("����", Font.BOLD, 30);
	
	//���� �ν��Ͻ�
	private Color color = new Color(75, 175, 135);
	private Color color2 = new Color(0, 0, 0);
	
	//���콺 ������ �ν��Ͻ�
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		add(lb);
		
		//�۲� ����
		lb.setFont(font);
		
		//���� ����
		//lb.setColor(color);
//		lb.setForeground(color);	//���ڻ�
//		lb.setBackground(color2);	//����
		
		//��� ��ü ���
		lb.setForeground(Color.cyan);
		lb.setBackground(Color.BLACK);
		
		lb.setCursor(cursor);
		
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
	
	public Window04() {
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

public class Test04 {

	public static void main(String[] args) {
		Window04 a = new Window04();	//â ����
	}

}
