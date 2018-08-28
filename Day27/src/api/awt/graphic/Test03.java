package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window03 extends Frame{
	
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

	private Panel panel = new Panel();
	private Button big = new Button("확대");
	private Button small = new Button("축소");
	private Button exit = new Button("종료");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(new BorderLayout());

		this.add(can, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout());
		panel.add(big);
		panel.add(small);
		panel.add(exit);
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
		
		ActionListener setBig = e->{
			if(width<=can.getWidth() && height<=can.getHeight()) {
				width+=30;
				height+=30;
				can.repaint();
			}
		};
		big.addActionListener(setBig);
		
		ActionListener setSmall = e->{
			if(width>75 && height>50) {
				width-=30;
				height-=30;
				can.repaint();
			}
		};
		small.addActionListener(setSmall);
		
		ActionListener setExit = e->{
			System.exit(0);
		};
		exit.addActionListener(setExit);
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window03() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(500, 200);	//x : 500, y : 200	(왼쪽 위 모서리 기준)
		setSize(600, 500);			//폭 : 600 , 높이 : 500
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test03 {
	public static void main(String[] args) {
		Window03 a = new Window03();	//창 생성
	}
}
