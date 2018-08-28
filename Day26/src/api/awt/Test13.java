package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Panel을 확장한 클래스
 */
class Mypanel extends Panel{
	private Button yes = new Button("예");
	private Button no = new Button("아니오");
	
	private GridLayout grid = new GridLayout(1, 2);
	
	public Mypanel() {
		this.setLayout(grid);
		this.add(yes);
		this.add(no);
	}
}

/**
 * Frame을 확장한 클래스
 */
class Window13 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("종료하시겠습니까?", Label.CENTER);
	
	//패널 : 레이아웃 설정이 가능한 투명한 컴포넌트
	private Mypanel panel = new Mypanel();
	
	private BorderLayout border = new BorderLayout();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(border);
		
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
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
	
	public Window13() {
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

public class Test13 {

	public static void main(String[] args) {
		Window13 a = new Window13();	//창 생성
	}

}
