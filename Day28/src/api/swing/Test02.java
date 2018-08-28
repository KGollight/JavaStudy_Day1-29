package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window02 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	Button-----> JButton : ���� �̹��� ���� / �׵θ� ���� �� ����� Ȯ���
//	private JButton bt = new JButton("Button");

//	Image ���´� �׷��� ������ Icon ���´� ���ϰ� ������ ����(���� �Ұ�)
	private ImageIcon icon = new ImageIcon("image/push.png");
	private JButton bt = new JButton(icon);

	public Window02() {
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
		
		con.setLayout(new BorderLayout());
		bt.setSize(300, 300);
		con.add(bt);
	}
	
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		// -> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x������ â ����
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//����� ���� ����
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		Window02 window = new Window02();
	}
}








