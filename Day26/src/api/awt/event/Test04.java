package api.awt.event;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window04 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		//처리해야할 메소드가 많아서 사용하기가 불편하다
		// -> 이러한 경우에는 OOOAdapter 클래스를 지원해준다
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
		
	}
	
	public Window04() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(100, 200);	//x : 100, y : 200	(왼쪽 위 모서리 기준)
		setSize(500, 400);			//폭 : 500 , 높이 : 400
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test04 {
	public static void main(String[] args) {
		Window04 a = new Window04();	//창 생성
	}
}
