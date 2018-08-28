package api.awt;

import java.awt.*;
import java.awt.event.*;

class MyPanel2 extends Panel{
	private Button[] bt = new Button[16];
	private String[] name = new String[] {
		"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "=", "%", "/"	
	};
	
	private GridLayout grid = new GridLayout(4, 4);
	
	public MyPanel2() {
		this.setLayout(grid);
		
		Font font = new Font("굴림", Font.ITALIC, 20);
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button(name[i]);
			bt[i].setForeground(Color.yellow);
			bt[i].setBackground(Color.BLACK);
			bt[i].setFont(font);
			this.add(bt[i]);
		}
	}
}

/**
 * Frame을 확장한 클래스
 */
class Window14 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("숫자 test", Label.RIGHT);
	
	private MyPanel2 panel = new MyPanel2();
	
	private BorderLayout border = new BorderLayout();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(border);
		
		Font font = new Font("굴림", Font.ITALIC, 50);
		lb.setFont(font);
		
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
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
	
	public Window14() {
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

public class Test14 {

	public static void main(String[] args) {
		Window14 a = new Window14();	//창 생성
	}

}
