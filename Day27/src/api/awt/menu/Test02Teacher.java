package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window02t extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private TextArea area = new TextArea();
	
	private MenuBar bar = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("편집");
	
	private MenuItem create = new MenuItem("새로 만들기");
	private MenuItem exit = new MenuItem("종료하기");
	
	private Menu font = new Menu("글꼴");
	private MenuItem big = new MenuItem("5pt 크게");
	private MenuItem small = new MenuItem("5pt 작게");
	
	private Menu color = new Menu("색상");
	private MenuItem black = new MenuItem("검정");
	private MenuItem red = new MenuItem("빨강");
	private MenuItem blue = new MenuItem("파랑");
	
	private int size = 10;
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
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
		
		//메뉴 이벤트 처리
		ActionListener listener = e->{
			if(e.getSource() == create) {
				area.setText("");
			}
			else if(e.getSource() == exit) {
				System.exit(0);
			}
			else if(e.getSource() == black) {
				area.setForeground(Color.black);
			}
			else if(e.getSource() == red) {
				area.setForeground(Color.red);
			}
			else if(e.getSource() == blue) {
				area.setForeground(Color.blue);
			}
			else if(e.getSource() == big) {
				size += 5;
				if(size > 150) size = 150;
				Font font = new Font("", Font.PLAIN, size);
				area.setFont(font);
			}
			else if(e.getSource() == small) {
				size -= 5;
				if(size < 5) size = 5;
				Font font = new Font("", Font.PLAIN, size);
				area.setFont(font);
			}
		};
		create.addActionListener(listener);
		exit.addActionListener(listener);
		black.addActionListener(listener);
		red.addActionListener(listener);
		blue.addActionListener(listener);
		big.addActionListener(listener);
		small.addActionListener(listener);
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
		edit.add(font);
		
		color.add(black);
		color.add(red);
		color.add(blue);
		
		font.add(big);
		font.add(small);
	}
	
	public Window02t() {
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

public class Test02Teacher {
	public static void main(String[] args) {
		Window02t a = new Window02t();	//창 생성
	}
}
