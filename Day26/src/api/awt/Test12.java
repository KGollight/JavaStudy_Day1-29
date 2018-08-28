package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window12 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("종료하시겠습니까?", Label.CENTER);
	private Button yes = new Button("예");
	private Button no = new Button("아니오");
	
	//패널 : 레이아웃 설정이 가능한 투명한 컴포넌트
	private Panel panel = new Panel();
	
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout(1, 2);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(border);
		
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		panel.setLayout(grid);
		panel.add(yes);
		panel.add(no);
	}
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void event() {
		
	}
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window12() {
		display();
		event();
		menu();
		
		// 표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트"); 		// 창 제목
		setLocation(500, 200); 		// x축 : 500, y축 : 200 (왼쪽 위 모서리 기준)
		setSize(600, 500); 			// 폭 : 600, 높이 : 500
		setResizable(false); 		// 창 크기 변경 여부

		setVisible(true); 			// 화면 표시
	}
}

public class Test12 {

	public static void main(String[] args) {
		Window12 a = new Window12();	//창 생성
	}

}
