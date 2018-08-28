package api.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window11 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button bt1 = new Button("버튼1");
	private Button bt2 = new Button("버튼2");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(null);
		
		bt1.setSize(120, 40);
		bt1.setLocation(50, 50);
		
		bt2.setBounds(200, 80, 50, 150);
		
		this.add(bt1);
		this.add(bt2);
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
	
	public Window11() {
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

public class Test11 {

	public static void main(String[] args) {
		Window11 a = new Window11();	//창 생성
	}

}
