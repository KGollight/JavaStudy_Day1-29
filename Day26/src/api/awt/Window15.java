package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
public class Window15 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("", Label.RIGHT);
	
	private ButtonPanel panel = new ButtonPanel();
	
	private BorderLayout layout = new BorderLayout();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(layout);
		
		Font font = new Font("굴림", Font.BOLD, 30);
		lb.setFont(font);
		lb.setText("숫자를 입력하세요");
		
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window15() {
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