package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window02 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private MenuBar bar = new MenuBar();
	
	private Menu file = new Menu("파일");
	private MenuItem create = new MenuItem("새로만들기");
	private MenuItem exit = new MenuItem("종료하기");
	
	private Menu edit = new Menu("편집");
	
	private Menu color = new Menu("색상");
	private MenuItem black = new MenuItem("검정");
	private MenuItem red = new MenuItem("빨강");
	private MenuItem blue = new MenuItem("파랑");
	
	private Menu style = new Menu("글꼴");
	private MenuItem big = new MenuItem("5pt 크게");
	private MenuItem small = new MenuItem("5pt 작게");
	
	private TextArea area = new TextArea();
	private FlowLayout flow = new FlowLayout();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(flow);
		this.add(area);
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		//x 버튼을 누르면 창을 종료하는 이벤트 설정
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(w);
		
//		글자 색깔 설정
		ActionListener setBlack = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.black);
			}
		};
		black.addActionListener(setBlack);
		
		ActionListener setRed = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		};
		red.addActionListener(setRed);
		
		ActionListener setBlue = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.blue);
			}
		};
		blue.addActionListener(setBlue);
		
//		글자 크기 설정
		ActionListener setBig = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int size = area.getFont().getSize();
				int big = size+5;
				Font font = new Font("굴림", Font.PLAIN, big);
				area.setFont(font);
			}
		};
		big.addActionListener(setBig);
		
		ActionListener setSmall = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int size = area.getFont().getSize();
				int small = size-5;
				Font font = new Font("굴림", Font.PLAIN, small);
				area.setFont(font);
			}
		};
		small.addActionListener(setSmall);
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		this.setMenuBar(bar);
		
		bar.add(file);
		bar.add(edit);
		
		file.add(create);
		file.add(exit);
		
		edit.add(color);
		color.add(black);
		color.add(red);
		color.add(blue);
		
		edit.add(style);
		style.add(big);
		style.add(small);
	}
	
	public Window02() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(500, 200);	//x : 500, y : 200	(왼쪽 위 모서리 기준)
		setSize(600, 500);			//폭 : 600 , 높이 : 500
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//창 생성
	}
}
