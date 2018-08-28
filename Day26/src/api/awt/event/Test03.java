package api.awt.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.text.DecimalFormat;
import java.text.Format;

/**
 * Frame을 확장한 클래스
 */
class Window03 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
	private Label lb = new Label("", Label.RIGHT);
	
	private Panel panel = new Panel();
	private Button start = new Button("시작");
	private Button stop = new Button("정지");
	private Button reset = new Button("초기화");
	
	/**
	 * 시간을 관리하는 변수(단위 : 밀리초)
	 */
	private long time = 0L;
	
	private Thread t;
	public void start() {
		
		//시작버튼 잠금
		start.setEnabled(false);
		stop.setEnabled(true);
		reset.setEnabled(false);
		
		t = new Thread() {
			@Override
			public void run() {
				while(true) {
					time+=10;
					displayTime();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		t.start();
	}
	public void stop() {
		start.setEnabled(true);
		stop.setEnabled(false);
		reset.setEnabled(true);
		t.stop();
	}
	public void reset() {
		time = 0L;
		displayTime();
	}
	public void displayTime() {
		long minute = time / 1000 / 60;
		long second = time / 1000 % 60;
		long millis = time % 1000;
		Format f = new DecimalFormat("00");
		String result = f.format(minute)+":"+f.format(second)+"."+f.format(millis/10);
		lb.setText(result);
	}
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.BOLD, 50);
		lb.setFont(font);
		
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(start);
		panel.add(stop);
		panel.add(reset);
		
		this.reset();
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		start.addActionListener(e->{
			//시간을 10초당 10밀리초씩 증가시켜 화면에 출력
			start();
		});
		stop.addActionListener(e->{
			//시간이 증가되는 작업을 중지
			stop();
		});
		reset.addActionListener(e->{
			reset();
		});
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
		setLocation(100, 200);	//x : 100, y : 200	(왼쪽 위 모서리 기준)
		setSize(500, 250);			//폭 : 500 , 높이 : 250
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test03 {
	public static void main(String[] args) {
		Window03 a = new Window03();	//창 생성
	}
}
