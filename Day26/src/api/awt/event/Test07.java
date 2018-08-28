package api.awt.event;

import java.awt.*;
import java.awt.event.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.beans.property.SimpleFloatProperty;

/**
 * Frame을 확장한 클래스
 */
class Window07 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
	private TextArea area = new TextArea();
	
	private ButtonPanel2 panel = new ButtonPanel2();
	
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(area, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.BOLD, 20);
		area.setFont(font);
		area.setBackground(Color.black);
		area.setForeground(Color.yellow);
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
		
		ActionListener num = e->{
			
		};
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window07() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(500, 200); 		// x축 : 500, y축 : 200 (왼쪽 위 모서리 기준)
		setSize(600, 500); 			// 폭 : 600, 높이 : 500
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test07 {
	public static void main(String[] args) {
		Window07 a = new Window07();	//창 생성
	}
}
