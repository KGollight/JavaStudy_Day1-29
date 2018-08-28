package api.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Frame을 확장한 클래스
 */
class Window09 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button[] bt = new Button[12];
	private String[] title = new String[] {
			"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"
	};
	
	private GridLayout grid = new GridLayout(4, 3);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(grid);
		
		Font font = new Font("궁서", Font.ITALIC, 15);
		for(int i=0; i<bt.length; i++) {
			bt[i] = new Button(title[i]);
			bt[i].setBackground(Color.black);
			bt[i].setForeground(Color.CYAN);
			this.add(bt[i]);
		}
		
		this.setBackground(Color.red);
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
	
	public Window09() {
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

public class Test09 {

	public static void main(String[] args) {
		Window09 a = new Window09();	//창 생성
	}

}
