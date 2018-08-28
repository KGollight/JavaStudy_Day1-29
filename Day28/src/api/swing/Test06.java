package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window06 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	�޴�
//	MenuBar		---->	JMenuBar
//	Menu		---->	JMenu
//	MenuItem	---->	JMenuItem
	
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("����");
	private JMenuItem exit = new JMenuItem("����");

	public Window06() {
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
		
		exit.addActionListener(e->{
//			System.exit(0);
			dispose();
//			setVisible(false);
		});
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		this.setJMenuBar(bar);
		
		bar.add(file);
		file.add(exit);
		
//		����Ű ������ ���ؼ��� Ű���� �����ϴ� Ŭ������ �˾ƾ� �Ѵ�.(KeyStroke)
//		KeyStroke altf4 = KeyStroke.getKeyStroke(
//				KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK);
		KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		exit.setAccelerator(esc);
	}
	
}

public class Test06 {
	public static void main(String[] args) {
//		��Ų ��ġ : â�� ������ ���� ����
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Window06 window = new Window06();
	}
}








