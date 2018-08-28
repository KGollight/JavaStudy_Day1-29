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
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window01 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	이미지를 표시할 영역
	private JLabel label = new JLabel("", JLabel.CENTER);
	
//	메뉴 구성 요소들
	private JMenuBar bar = new JMenuBar();
	
	private JMenu file = new JMenu("파일");
	private JMenuItem open = new JMenuItem("불러오기");
	private JMenuItem save = new JMenuItem("저장하기");
	private JMenuItem exit = new JMenuItem("종료하기");
	
	private JMenu help = new JMenu("도움말");
	private JMenuItem info = new JMenuItem("프로그램 정보");
	
	public Window01() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing 예제");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	/**
	 * 화면 구현 메소드
	 */
	public void display() {
		this.setContentPane(con);//con을 Component 설정 영역으로 등록
		
		//this말고 con에 컴포넌트를 추가
		con.setLayout(new BorderLayout());
		con.add(label);
	}
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
//		awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
//		 -> Swing에서는 옵션을 통해 지정하도록 변경
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 프로그램 종료
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x누르면 창 숨김
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		
//		메뉴 이벤트
		open.addActionListener(e->{
			JFileChooser chooser = new JFileChooser(".");
//			JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
			chooser.setFileFilter(new FileNameExtensionFilter("PNG 이미지", "png"));
			chooser.setFileFilter(new FileNameExtensionFilter("JPEG 이미지", "jpg"));
			chooser.setFileFilter(new FileNameExtensionFilter("GIF 이미지", "gif"));
			int choice = chooser.showOpenDialog(con);
			if(choice == 0) {
				File target = chooser.getSelectedFile();
			
//				이미지 표시
				ImageIcon icon = new ImageIcon(target.getAbsolutePath());
				label.setIcon(icon);
			}
		});
		save.addActionListener(e->{
			JFileChooser chooser = new JFileChooser(".");
			chooser.setFileFilter(new FileNameExtensionFilter("PNG 이미지", "png"));
			chooser.setFileFilter(new FileNameExtensionFilter("JPEG 이미지", "jpg"));
			chooser.setFileFilter(new FileNameExtensionFilter("GIF 이미지", "gif"));
			
			int choice = chooser.showSaveDialog(con);
			if(choice == 0) {
				File target = chooser.getSelectedFile();
				
//				이름을 분리하여 확장자 알아내기
				String filename = target.getName();
				String extension = filename.substring(filename.lastIndexOf(".")+1);
				System.out.println("filename = "+filename);
				System.out.println("extension = "+extension);
				
//				ImageIcon을 BufferedImage로 바꿔서 저장
				ImageIcon icon = (ImageIcon) label.getIcon();
				
//				비어있는 이미지 생성
				BufferedImage img = 
						new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), 
																		BufferedImage.TYPE_INT_ARGB);
//				딸려있는 pen을 추출
				Graphics pen = img.getGraphics();
//				pen을 이용하여 icon을 img에 그린다
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
			JOptionPane.showMessageDialog(con, "개발자 : 홍길동");
		});
	}
	/**
	 * 메뉴 구현 메소드
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









