package api.swing;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window10 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("알림창");
	private JButton b = new JButton("확인창");
	private JButton c = new JButton("입력창");
	private JButton d = new JButton("색상선택");
	private JButton e = new JButton("파일선택");

	public Window10() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing 예제");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);//위치를 운영체제의 규칙에 따름
		this.setSize(400, 400);
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
		con.add(toolbar, BorderLayout.NORTH);
		
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar.add(d);
		toolbar.add(e);
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
		
		a.addActionListener(e->{
			//[1] 알림창 : JOptionPane.showMessageDialog()
//			JOptionPane.showMessageDialog(Window10.this, "알림창 테스트");
//			JOptionPane.showMessageDialog(con, "알림창 테스트", "제목", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showInternalMessageDialog(
					con, "알림창 테스트", "제목", JOptionPane.PLAIN_MESSAGE);
		});
		
		b.addActionListener(e->{
			//[2] 확인창 : JOptionPane.showConfirmDialog()
			int c = JOptionPane.showConfirmDialog(
					con, "확인창 테스트", "제목", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.PLAIN_MESSAGE);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("예를 누르셨네요");
			}
		});

		c.addActionListener(e->{
			//[3] 입력창 : JOptionPane.showInputDialog()
			String text = JOptionPane.showInputDialog("입력");
			System.out.println("text = "+text);
		});

		d.addActionListener(e->{
			//[4] 색상선택창 : JColorChooser.showDialog()
			Color color = JColorChooser.showDialog(con, "골라골라", Color.black);
//			System.out.println("color = "+color);
			if(color!=null) {
				con.setBackground(color);
			}
		});

		e.addActionListener(e->{
			//[5] 파일선택창 : JFileChooser(인스턴스 필요)
//			JFileChooser fc = new JFileChooser();
			JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
			int c = fc.showOpenDialog(con);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("파일을 불러옵니다.");
				File f = fc.getSelectedFile();
			}
		});
	}
	
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
	
}

public class Test10 {
	public static void main(String[] args) {
//		스킨 설치 : 창이 켜지기 전에 수행
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Window10 window = new Window10();
	}
}








