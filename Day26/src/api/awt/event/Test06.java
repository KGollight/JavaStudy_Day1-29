package api.awt.event;

import java.awt.*;
import java.awt.event.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.beans.property.SimpleFloatProperty;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window06 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	
	private TextArea area = new TextArea();
	
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(area);
		
		Font font = new Font("����", Font.PLAIN, 30);
		area.setFont(font);
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
		
		//area�� Ű���� �̺�Ʈ�� ���� ����
		//press, release�� �ƽ�Ű�ڵ常 ����(���Ű ���� ����)
		//type�� �����ڵ带 ����(���Ű ���� �Ұ�)
		KeyListener k = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//�߻��� Ű���� �̺�Ʈ�� ���� ������ �м�
				System.out.println(e);
				System.out.println(e.getSource());//�߻� ������Ʈ �ν��Ͻ�
				System.out.println(e.getKeyCode());//Ű���� ascii �ڵ尪
//				System.out.println(e.getKeyChar());
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ESCAPE:
					System.out.println("ESC ����");
					break;
				case KeyEvent.VK_ENTER:
					System.out.println("Enter ����");
					break;
				case KeyEvent.VK_F5:
					Date d = new Date();
					Format f = new SimpleDateFormat("h:m:s");
					String time = f.format(d);
//					area.setText(time);
					area.append(time);
					break;
				}
			}
		};
		area.addKeyListener(k);
		
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window06() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(500, 200); 		// x�� : 500, y�� : 200 (���� �� �𼭸� ����)
		setSize(600, 500); 			// �� : 600, ���� : 500
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test06 {
	public static void main(String[] args) {
		Window06 a = new Window06();	//â ����
	}
}
