package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window07 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	입력창
	private JTextField tf = new JTextField();
	private JPasswordField pf = new JPasswordField();
	private JCheckBox cb = new JCheckBox("동의합니다");
	private JRadioButton r1 = new JRadioButton("성인");
	private JRadioButton r2 = new JRadioButton("미성년자");

	public Window07() {
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
		con.setLayout(new GridLayout(5, 1));
		con.add(tf);
		con.add(pf);
		con.add(cb);
		con.add(r1);
		con.add(r2);
		
//		버튼 그룹을 만들어서 r1, r2가 그룹임을 알려준다
		r1.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
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
		
		cb.addItemListener(e->{
			System.out.println(e);
			System.out.println(e.getStateChange());
			System.out.println(e.getItem());
//			if(e.getStateChange()==ItemEvent.SELECTED) {
			if(cb.isSelected()) {
				System.out.println("체크네? 체크여");
			}
			else {
				System.out.println("체크가... 진다.....");
			}
		});
	}
	
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
	
}

public class Test07 {
	public static void main(String[] args) {
//		스킨 설치 : 창이 켜지기 전에 수행
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Window07 window = new Window07();
	}
}








