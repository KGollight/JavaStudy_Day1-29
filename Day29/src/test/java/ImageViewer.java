package test.java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

class WindowView extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JMenuBar bar = new JMenuBar();
	private JMenu fileMenu = new JMenu("���� �޴�");
	private JMenuItem exit = new JMenuItem("�����ϱ�");//(ctrl+q)
	private JMenuItem open = new JMenuItem("�ҷ�����");//(ctrl+o)
	private JMenuItem save = new JMenuItem("�����ϱ�");//(ctrl+s)
	
	private JMenu infoMenu = new JMenu("���� �޴�");
	private JMenuItem info = new JMenuItem("���α׷� ����");//(F5)
	
	private String str = "";
	private ImageIcon icon = new ImageIcon(str);
	private JButton img = new JButton(icon);

	public WindowView() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("�̹��� ���");
		this.setLocationByPlatform(true);//��ġ�� �ü���� ��Ģ�� ����
		this.setSize(500, 500);
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
		con.add(bar, BorderLayout.NORTH);
		
		con.add(img, BorderLayout.CENTER);
		
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
		
//		<����Ű ����>
		//���� �ҷ����� ����Ű
		KeyStroke ctrlO = KeyStroke.getKeyStroke(
				KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		open.setAccelerator(ctrlO);
		
		//���� �����ϱ� ����Ű
		KeyStroke ctrlS = KeyStroke.getKeyStroke(
				KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		save.setAccelerator(ctrlS);
		
		//�����ϱ� ����Ű
		KeyStroke ctrlQ = KeyStroke.getKeyStroke(
				KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
		exit.setAccelerator(ctrlQ);
		
		//������ ���� ����Ű
		KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0);
		info.setAccelerator(f5);
		
//		<�޴� ������ ����>
		//fileMenu - open �ҷ�����
		open.addActionListener(e->{
			JFileChooser fc = new JFileChooser();
			int c = fc.showOpenDialog(con);
			if(c==0) {
				File f = fc.getSelectedFile();
				str = f.getAbsolutePath();
				System.out.println(str);
			}
		});
		
		//fileMenu - save �����ϱ�
		save.addActionListener(e->{
			JFileChooser fc = new JFileChooser();
			int c = fc.showSaveDialog(this);
			if(c==0) {
				System.out.println("������ ����Ǿ����ϴ�.");
			}
		});
		
		//fileMenu - exit �����ϱ�
		exit.addActionListener(e->{
			dispose();
		});
		
		//infoMenu - info ������ ����
		info.addActionListener(e->{
			JOptionPane.showInternalMessageDialog(
					con, "���¿��Դϴ�~", "������ ����", JOptionPane.PLAIN_MESSAGE);
		});
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		this.setJMenuBar(bar);
		
		bar.add(fileMenu);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(exit);

		bar.add(infoMenu);
		infoMenu.add(info);
	}
	
}

public class ImageViewer {
	public static void main(String[] args) {

		WindowView window = new WindowView();
	}
}





