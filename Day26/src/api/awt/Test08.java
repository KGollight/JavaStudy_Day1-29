package api.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Frame을 확장한 클래스
 */
class Window08 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button bt1 = new Button("1");
	private Button bt2 = new Button("2");
	private Button bt3 = new Button("3");
	private Button bt4 = new Button("4");
	private Button bt5 = new Button("5");
	private Button bt6 = new Button("6");
	private Button bt7 = new Button("7");
	private Button bt8 = new Button("8");
	private Button bt9 = new Button("9");
	private Button bt10 = new Button("*");
	private Button bt11 = new Button("0");
	private Button bt12 = new Button("#");
	
	private GridLayout grid = new GridLayout(4, 3);
	private Font font = new Font("궁서", Font.ITALIC, 15);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(grid);
		
		this.add(bt1);	//this(창)에 bt를 추가하겠습니다.
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		this.add(bt9);
		this.add(bt10);
		this.add(bt11);
		this.add(bt12);
		
		this.setFont(font);
		this.setBackground(Color.white);
		this.setForeground(Color.cyan);
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
	
	public Window08() {
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

public class Test08 {

	public static void main(String[] args) {
		Window08 a = new Window08();	//창 생성
	}

}
