package api.awt.event;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window01 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Button bt = new Button("눌러욧!");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		//this.setLayout(border);
		this.add(bt/*, BorderLayout.CENTER*/);
	}
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void event() {
		//버튼을 누르면 간단한 출력메세지 코드가 실행되도록 연결
		
		//처리 인스턴스 생성
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("테스트!");
				System.exit(0);
			}
		};
		bt.addActionListener(listener);
	}
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window01() {
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

public class Test01 {

	public static void main(String[] args) {
		Window01 a = new Window01();	//창 생성
	}

}
