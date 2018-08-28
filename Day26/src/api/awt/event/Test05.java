package api.awt.event;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window05 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button bt = new Button("누르세요!");
	
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(bt);
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
		
		
		MouseListener m = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println("mouseClicked");
//				발생한 이벤트의 상세 정보를 분석?
				System.out.println(e);
				System.out.println(e.getButton());//어느 마우스 버튼을 눌렀는가?
				System.out.println(e.getWhen());//언제 눌렀는가?
				System.out.println(e.getClickCount());//몇번 연속 클릭했는가?
				
				System.out.println(e.getSource());//뭘 눌렀는가?
				System.out.println(bt);
				System.out.println(e.getSource() == bt);
			}
		};
		bt.addMouseListener(m);
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window05() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(100, 200);	//x : 100, y : 200	(왼쪽 위 모서리 기준)
		setLocation(500, 200); 		// x축 : 500, y축 : 200 (왼쪽 위 모서리 기준)
		setSize(600, 500); 			// 폭 : 600, 높이 : 500
		
		setVisible(true);				//화면 표시
	}
}

public class Test05 {
	public static void main(String[] args) {
		Window05 a = new Window05();	//창 생성
	}
}
