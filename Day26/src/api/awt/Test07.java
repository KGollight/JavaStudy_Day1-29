package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window07 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button bt1 = new Button("버튼1");
	private Button bt2 = new Button("버튼2");
	private Button bt3 = new Button("버튼3");
	private Button bt4 = new Button("버튼4");
	
	private GridLayout grid = new GridLayout(2, 2);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(grid);
		
		this.add(bt1);	//this(창)에 bt를 추가하겠습니다.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
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
	
	public Window07() {
		display();
		event();
		menu();
		
		// 표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트"); 		// 창 제목
		setLocation(650, 350); 		// x축 : 650, y축 : 350 (왼쪽 위 모서리 기준)
		setSize(300, 200); 			// 폭 : 300, 높이 : 200
		setResizable(false); 		// 창 크기 변경 여부

		setVisible(true); 			// 화면 표시
	}
}

public class Test07 {

	public static void main(String[] args) {
		Window07 a = new Window07();	//창 생성
	}

}
