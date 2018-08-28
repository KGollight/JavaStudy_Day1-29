package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window02 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	Button-----> JButton : 쉽게 이미지 설정 / 테두리 설정 등 기능이 확장됨
//	private JButton bt = new JButton("Button");

//	Image 형태는 그려야 하지만 Icon 형태는 편리하게 설정이 가능(편집 불가)
	private ImageIcon icon = new ImageIcon("image/push.png");
	private JButton bt = new JButton(icon);

	public Window02() {
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
		bt.setSize(300, 300);
		con.add(bt);
	}
	
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		// -> Swing에서는 옵션을 통해 지정하도록 변경
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x누르면 프로그램 종료
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x누르면 창 숨김
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//사용자 직접 구현
	}
	
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		Window02 window = new Window02();
	}
}








