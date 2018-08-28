package api.awt.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window01 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private MenuBar bar = new MenuBar();
	
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("편집");
	
	private MenuItem create = new MenuItem("새로 만들기");
	private MenuItem open = new MenuItem("열기");
	private MenuItem save = new MenuItem("저장");
	private MenuItem exit = new MenuItem("종료");
	
	private Menu view = new Menu("보기");
	private MenuItem big = new MenuItem("크게");
	private MenuItem normal = new MenuItem("보통");
	private MenuItem small = new MenuItem("작게");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		
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
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
//		this.add(bar);
		this.setMenuBar(bar);
		
		bar.add(file);
		bar.add(edit);
		
		file.add(create);
		file.addSeparator();//구분선
		file.add(open);
		file.add(save);
		file.addSeparator();//구분선
		file.add(exit);
		
		edit.add(view);
		view.add(big);
		view.add(normal);
		view.add(small);
	}
	
	public Window01() {
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

public class Test01 {
	public static void main(String[] args) {
		Window01 a = new Window01();	//창 생성
	}
}
