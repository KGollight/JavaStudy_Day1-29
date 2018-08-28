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
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JMenuBar bar = new JMenuBar();
	private JMenu fileMenu = new JMenu("파일 메뉴");
	private JMenuItem exit = new JMenuItem("종료하기");//(ctrl+q)
	private JMenuItem open = new JMenuItem("불러오기");//(ctrl+o)
	private JMenuItem save = new JMenuItem("저장하기");//(ctrl+s)
	
	private JMenu infoMenu = new JMenu("도움말 메뉴");
	private JMenuItem info = new JMenuItem("프로그램 정보");//(F5)
	
	private String str = "";
	private ImageIcon icon = new ImageIcon(str);
	private JButton img = new JButton(icon);

	public WindowView() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("이미지 뷰어");
		this.setLocationByPlatform(true);//위치를 운영체제의 규칙에 따름
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * 화면 구현 메소드
	 */
	public void display() {
		this.setContentPane(con);//con을 Component 설정 영역으로 등록
		
		//this말고 con에 컴포넌트를 추가
		con.setLayout(new BorderLayout());
		con.add(bar, BorderLayout.NORTH);
		
		con.add(img, BorderLayout.CENTER);
		
	}
	
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		// -> Swing에서는 옵션을 통해 지정하도록 변경
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x누르면 프로그램 종료
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x누르면 창 숨김
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//사용자 직접 구현
		
//		<단축키 지정>
		//파일 불러오기 단축키
		KeyStroke ctrlO = KeyStroke.getKeyStroke(
				KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		open.setAccelerator(ctrlO);
		
		//파일 저장하기 단축키
		KeyStroke ctrlS = KeyStroke.getKeyStroke(
				KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		save.setAccelerator(ctrlS);
		
		//종료하기 단축키
		KeyStroke ctrlQ = KeyStroke.getKeyStroke(
				KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
		exit.setAccelerator(ctrlQ);
		
		//개발자 정보 단축키
		KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0);
		info.setAccelerator(f5);
		
//		<메뉴 아이템 설정>
		//fileMenu - open 불러오기
		open.addActionListener(e->{
			JFileChooser fc = new JFileChooser();
			int c = fc.showOpenDialog(con);
			if(c==0) {
				File f = fc.getSelectedFile();
				str = f.getAbsolutePath();
				System.out.println(str);
			}
		});
		
		//fileMenu - save 저장하기
		save.addActionListener(e->{
			JFileChooser fc = new JFileChooser();
			int c = fc.showSaveDialog(this);
			if(c==0) {
				System.out.println("파일이 저장되었습니다.");
			}
		});
		
		//fileMenu - exit 종료하기
		exit.addActionListener(e->{
			dispose();
		});
		
		//infoMenu - info 개발자 정보
		info.addActionListener(e->{
			JOptionPane.showInternalMessageDialog(
					con, "김태우입니다~", "개발자 정보", JOptionPane.PLAIN_MESSAGE);
		});
	}
	
	/**
	 * 메뉴 구현 메소드
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





