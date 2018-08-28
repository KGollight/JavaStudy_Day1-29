package api.awt.extend;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window02 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	
//	��� ���α׷����� ���������� �ʿ�� �ϴ� 
//	���Ͽ���â / ������â ���� �̸� ������� Ŭ������ ���°�?
	private FileDialog fwindow = 
			new FileDialog(this, "���� �����Դϴ�", FileDialog.LOAD);
	
	private Button open = new Button("����");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(open);
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
		
		open.addActionListener(e->{
			//���� ����â�� ǥ��
			fwindow.setVisible(true);
			
			//���� ����â�� ������ ������ �۾��� �ۼ�
			// - ���⸦ ��������? �����ٸ� ���� �����ΰ���?
			String dir = fwindow.getDirectory();
			String name = fwindow.getFile();
			System.out.println("dir = "+dir);
			System.out.println("name = "+name);
			
			if(dir!=null && name!=null) {
				System.out.println("���� ���� �ڵ带 �����մϴ�!");
			}
		});
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
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
