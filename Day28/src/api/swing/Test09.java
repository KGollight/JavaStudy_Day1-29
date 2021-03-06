package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window09 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	툴바 - 레이아웃을 통해 배치가 가능
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("1번");
	private JButton b = new JButton("2번");
	private JButton c = new JButton("3번");
	private JButton d = new JButton("4번");
	private JButton e = new JButton("5번");
	
	private JToolBar toolbar2 = new JToolBar();

	public Window09() {
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
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		// -> Swing에서는 옵션을 통해 지정하도록 변경
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x누르면 프로그램 종료
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x누르면 창 숨김
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//사용자 직접 구현
	}
	
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
	
}

public class Test09 {
	public static void main(String[] args) {
//		스킨 설치 : 창이 켜지기 전에 수행
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Window09 window = new Window09();
	}
}








