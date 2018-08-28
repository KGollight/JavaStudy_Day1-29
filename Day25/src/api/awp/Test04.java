package api.awp;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window04 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("라벨 테스트~!", Label.CENTER);
	
	//글꼴 인스턴스
	private Font font = new Font("굴림", Font.BOLD, 30);
	
	//색상 인스턴스
	private Color color = new Color(75, 175, 135);
	private Color color2 = new Color(0, 0, 0);
	
	//마우스 포인터 인스턴스
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		add(lb);
		
		//글꼴 설정
		lb.setFont(font);
		
		//색상 설정
		//lb.setColor(color);
//		lb.setForeground(color);	//글자색
//		lb.setBackground(color2);	//배경색
		
		//상수 객체 사용
		lb.setForeground(Color.cyan);
		lb.setBackground(Color.BLACK);
		
		lb.setCursor(cursor);
		
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
	
	public Window04() {
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

public class Test04 {

	public static void main(String[] args) {
		Window04 a = new Window04();	//창 생성
	}

}
