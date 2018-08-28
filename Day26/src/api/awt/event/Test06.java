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
class Window06 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
	private TextArea area = new TextArea();
	
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(area);
		
		Font font = new Font("굴림", Font.PLAIN, 30);
		area.setFont(font);
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
		
		//area에 키보드 이벤트를 연결 설정
		//press, release는 아스키코드만 감지(기능키 감지 가능)
		//type은 유니코드를 감지(기능키 감지 불가)
		KeyListener k = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//발생한 키보드 이벤트에 대한 정보를 분석
				System.out.println(e);
				System.out.println(e.getSource());//발생 컴포넌트 인스턴스
				System.out.println(e.getKeyCode());//키보드 ascii 코드값
//				System.out.println(e.getKeyChar());
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_ESCAPE:
					System.out.println("ESC 감지");
					break;
				case KeyEvent.VK_ENTER:
					System.out.println("Enter 감지");
					break;
				case KeyEvent.VK_F5:
					Date d = new Date();
					Format f = new SimpleDateFormat("h:m:s");
					String time = f.format(d);
//					area.setText(time);
					area.append(time);
					break;
				}
			}
		};
		area.addKeyListener(k);
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	
	public Window06() {
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

public class Test06 {
	public static void main(String[] args) {
		Window06 a = new Window06();	//창 생성
	}
}
