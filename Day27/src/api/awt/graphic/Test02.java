package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window02 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Image img = Toolkit.getDefaultToolkit().getImage("image/cat.jpg");
	private int x = 10, y = 10, width = 200, height = 150;
	private Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			g.drawImage(img, x, y, width, height, this);
		}
	};
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(can);
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		//x 버튼을 누르면 창을 종료하는 이벤트 설정
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(w);
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window02() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(500, 200);	//x : 500, y : 200	(왼쪽 위 모서리 기준)
		setSize(600, 500);			//폭 : 600 , 높이 : 500
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
		
		walk();
	}
	
	public void walk() {
//		이동을 구현하기 위해 해야할 작업
//		[1] 좌표를 변경 -> [2] 다시 그려라
		while(true) {
			x++;
			System.out.println("x = "+x);
			
			if(x>=can.getWidth()+10)
				break;
			
			can.repaint();//paint()를 다시 실행하세요
			try {
				Thread.sleep(100);
			} catch (Exception e) {	}
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//창 생성
	}
}
