package api.awt.extend;

import java.awt.*;
import java.awt.event.*;

class Dialog01 extends Dialog{

	private void display() {}
	private void event() {
		//Dialog는 종료될 때 어덯게 처리해야 하는가?
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);		//프로그램 종료
//				setVisible(false);	//숨김
				dispose();			//현재 창을 소멸
			}
		};
	}
	private void menu() {}
	
	public Dialog01(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		display();
		event();
		menu();
		
		setLocation(600, 200);
		setSize(300, 400);
		setResizable(false);
//		setVisible(true);
	}
}

/**
 * Frame을 확장한 클래스
 */
class Window01 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Dialog sub = new Dialog(this, "제목", false);//true : 선택 불가, false : 선택 가능
	
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

//		setVisible(true);
	}
}

public class Test01 {
	public static void main(String[] args) {
		Window01 a = new Window01();	//창 생성
	}
}
