package quiz.module1;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window01 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	�̹����� ǥ���� ����
	private JLabel label = new JLabel("", JLabel.CENTER);
	
//	�޴� ���� ��ҵ�
	private JMenuBar bar = new JMenuBar();
	
	private JMenu file = new JMenu("����");
	private JMenuItem open = new JMenuItem("�ҷ�����");
	private JMenuItem save = new JMenuItem("�����ϱ�");
	private JMenuItem exit = new JMenuItem("�����ϱ�");
	
	private JMenu help = new JMenu("����");
	private JMenuItem info = new JMenuItem("���α׷� ����");
	
	public Window01() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing ����");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		this.setContentPane(con);//con�� Component ���� �������� ���
		
		//this���� con�� ������Ʈ�� �߰�
		con.setLayout(new BorderLayout());
		con.add(label);
	}
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
//		awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
//		 -> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x������ ���α׷� ����
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x������ â ����
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		
//		�޴� �̺�Ʈ
		open.addActionListener(e->{
			JFileChooser chooser = new JFileChooser(".");
//			JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
			chooser.setFileFilter(new FileNameExtensionFilter("PNG �̹���", "png"));
			chooser.setFileFilter(new FileNameExtensionFilter("JPEG �̹���", "jpg"));
			chooser.setFileFilter(new FileNameExtensionFilter("GIF �̹���", "gif"));
			int choice = chooser.showOpenDialog(con);
			if(choice == 0) {
				File target = chooser.getSelectedFile();
			
//				�̹��� ǥ��
				ImageIcon icon = new ImageIcon(target.getAbsolutePath());
				label.setIcon(icon);
			}
		});
		save.addActionListener(e->{
			JFileChooser chooser = new JFileChooser(".");
			chooser.setFileFilter(new FileNameExtensionFilter("PNG �̹���", "png"));
			chooser.setFileFilter(new FileNameExtensionFilter("JPEG �̹���", "jpg"));
			chooser.setFileFilter(new FileNameExtensionFilter("GIF �̹���", "gif"));
			
			int choice = chooser.showSaveDialog(con);
			if(choice == 0) {
				File target = chooser.getSelectedFile();
				
//				�̸��� �и��Ͽ� Ȯ���� �˾Ƴ���
				String filename = target.getName();
				String extension = filename.substring(filename.lastIndexOf(".")+1);
				System.out.println("filename = "+filename);
				System.out.println("extension = "+extension);
				
//				ImageIcon�� BufferedImage�� �ٲ㼭 ����
				ImageIcon icon = (ImageIcon) label.getIcon();
				
//				����ִ� �̹��� ����
				BufferedImage img = 
						new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), 
																		BufferedImage.TYPE_INT_ARGB);
//				�����ִ� pen�� ����
				Graphics pen = img.getGraphics();
//				pen�� �̿��Ͽ� icon�� img�� �׸���
				pen.drawImage(icon.getImage(), 0, 0, img.getWidth(), img.getHeight(), null);
				
				try {
					System.out.println(ImageIO.write(img, extension, target));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		exit.addActionListener(e->{
			System.exit(0);
//			setVisible(false);
//			dispose();
		});
		info.addActionListener(e->{
			JOptionPane.showMessageDialog(con, "������ : ȫ�浿");
		});
	}
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		this.setJMenuBar(bar);
		
		bar.add(file);
		bar.add(help);
		
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		
		help.add(info);
		
		KeyStroke ctrl_o = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		KeyStroke ctrl_s = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		KeyStroke ctrl_q = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
		KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0);
		
		open.setAccelerator(ctrl_o);
		save.setAccelerator(ctrl_s);
		exit.setAccelerator(ctrl_q);
		info.setAccelerator(f5);
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Window01 window = new Window01();
	}
}









