package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window01 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();

	public Window01() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing ����");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);//��ġ�� �ü���� ��Ģ�� ����
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		this.setContentPane(con);//con�� Component ���� �������� ���
		
		//this���� con�� ������Ʈ�� �߰�
	}
	
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		// -> Swing������ �ɼ��� ���� �����ϵ��� ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x������ â ����
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//����� ���� ����
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Window01 window = new Window01();
	}
}








