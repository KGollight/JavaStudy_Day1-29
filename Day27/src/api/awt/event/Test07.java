package api.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import api.awt.event.*;

//18일차 과제 - 핸드폰 자판 버튼 만들기

/**
 * Frame을 확장한 클래스
 */
class Window07 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private Label lb = new Label("", Label.RIGHT);
	
	private Panel panel = new Panel();
	private Button[] bt = new Button[15];
	private String[] title = new String[] {
		"1","2","3","4","5","6","7","8","9","*","0","#","지우기","통화","전체삭제"
	};
	
	private StringBuffer sb = new StringBuffer();
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
//		프레임 : BorderLayout
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
//		lb.setPreferredSize(new Dimension(this.getWidth(), 100));
		
//		panel : GridLayout
		panel.setLayout(new GridLayout(5, 3));
		for(int i=0; i < bt.length; i++) {
			bt[i] = new Button(title[i]);
			panel.add(bt[i]);
		}
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
		
		//[1] 번호 패드에 대한 이벤트 설정
		//[2] 지우기에 대한 이벤트 설정
		//[3] 통화에 대한 이벤트 설정
		//[4] 전체삭제에 대한 이벤트 설정
		
		ActionListener a = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				알아내야할 정보 : 무슨 버튼을 눌렀는가...(버튼에 씌여진 글자)
//				(1) ActionEvent에만 있는 e.getActionCommand() 사용
//				System.out.println(e.getActionCommand());
//				(2) e.getSource()로 버튼을 얻어낸 뒤 글자 추출
//				Button btn = (Button) e.getSource();
//				System.out.println(btn.getLabel());
				
				addText(e.getActionCommand());
			}
		};
		
		for(int i=0; i < 12; i++) {
			bt[i].addActionListener(a);
		}
		
		ActionListener b = e->{
			if(sb.length() > 0) {
				removeLastText();
			}
		};
		bt[12].addActionListener(b);
		
		ActionListener c = e->{
			clearText();
		};
		bt[14].addActionListener(c);
		
	}
	
	public void clearText() {
		sb = new StringBuffer();
		lb.setText(sb.toString());
	}
	
	public void removeLastText() {
		sb.deleteCharAt(sb.length() - 1);
		lb.setText(sb.toString());
	}
	
	public void addText(String text) {
		sb.append(text);
		lb.setText(sb.toString());
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
		setLocation(100, 200);	//x : 100, y : 200	(왼쪽 위 모서리 기준)
		setSize(500, 400);			//폭 : 500 , 높이 : 400
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test07 {
	public static void main(String[] args) {
		Window07 a = new Window07();	//창 생성
	}
}
