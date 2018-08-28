package api.swing;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window10 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("�˸�â");
	private JButton b = new JButton("Ȯ��â");
	private JButton c = new JButton("�Է�â");
	private JButton d = new JButton("������");
	private JButton e = new JButton("���ϼ���");

	public Window10() {
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
		con.add(toolbar, BorderLayout.NORTH);
		
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar.add(d);
		toolbar.add(e);
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
		
		a.addActionListener(e->{
			//[1] �˸�â : JOptionPane.showMessageDialog()
//			JOptionPane.showMessageDialog(Window10.this, "�˸�â �׽�Ʈ");
//			JOptionPane.showMessageDialog(con, "�˸�â �׽�Ʈ", "����", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showInternalMessageDialog(
					con, "�˸�â �׽�Ʈ", "����", JOptionPane.PLAIN_MESSAGE);
		});
		
		b.addActionListener(e->{
			//[2] Ȯ��â : JOptionPane.showConfirmDialog()
			int c = JOptionPane.showConfirmDialog(
					con, "Ȯ��â �׽�Ʈ", "����", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.PLAIN_MESSAGE);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("���� �����̳׿�");
			}
		});

		c.addActionListener(e->{
			//[3] �Է�â : JOptionPane.showInputDialog()
			String text = JOptionPane.showInputDialog("�Է�");
			System.out.println("text = "+text);
		});

		d.addActionListener(e->{
			//[4] ������â : JColorChooser.showDialog()
			Color color = JColorChooser.showDialog(con, "�����", Color.black);
//			System.out.println("color = "+color);
			if(color!=null) {
				con.setBackground(color);
			}
		});

		e.addActionListener(e->{
			//[5] ���ϼ���â : JFileChooser(�ν��Ͻ� �ʿ�)
//			JFileChooser fc = new JFileChooser();
			JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
			int c = fc.showOpenDialog(con);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("������ �ҷ��ɴϴ�.");
				File f = fc.getSelectedFile();
			}
		});
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
	
}

public class Test10 {
	public static void main(String[] args) {
//		��Ų ��ġ : â�� ������ ���� ����
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Window10 window = new Window10();
	}
}








