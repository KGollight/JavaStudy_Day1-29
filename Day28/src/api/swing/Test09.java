package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window09 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	���� - ���̾ƿ��� ���� ��ġ�� ����
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("1��");
	private JButton b = new JButton("2��");
	private JButton c = new JButton("3��");
	private JButton d = new JButton("4��");
	private JButton e = new JButton("5��");
	
	private JToolBar toolbar2 = new JToolBar();

	public Window09() {
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
		JPanel panel = new JPanel();
		con.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(toolbar);
		panel.add(toolbar2);
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar2.add(d);
		toolbar2.add(e);
		
		JTextField field = new JTextField(20);
		toolbar2.add(field);
		
//		toolbar.setFloatable(false);
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

public class Test09 {
	public static void main(String[] args) {
//		��Ų ��ġ : â�� ������ ���� ����
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Window09 window = new Window09();
	}
}








