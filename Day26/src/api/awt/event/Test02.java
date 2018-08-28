package api.awt.event;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Frame을 확장한 클래스
 */
class Window02 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	private TextArea area = new TextArea();
	
	private Panel panel = new Panel();
	private Button open = new Button("열기");
	private Button save = new Button("저장");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(area, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.PLAIN, 30);
		area.setFont(font);
		
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(save);
		panel.add(open);
	}
	
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	private void event() {
		ActionListener opener = e->{
			//simple.txt의 내용을 불러와서 화면에 출력
			File target = new File("simple.txt");

			StringBuffer sb = new StringBuffer();
			try(BufferedReader in = new BufferedReader(new FileReader(target));){
				while(true) {
					String line = in.readLine();
					if(line == null) break;
					sb.append(line+"\n");
				}
			}
			catch(IOException error) {
				error.printStackTrace();
			}
			
			//System.out.println(sb.toString());
			area.setText(sb.toString());
			
		};
		ActionListener saver = e->{
			//simple.txt에 어떤 문자열을 저장
			File target = new File("simple.txt");
			
//			String text = "hello java";
			String text = area.getText();
			
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(target)));){
				out.println(text);
//				out.flush();
			}
			catch(Exception error) {
				error.printStackTrace();
			}
			
			Window02.this.setTitle("저장 완료");
		};
		
		save.addActionListener(saver);
		open.addActionListener(opener);
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
		setLocation(100, 200);	//x : 100, y : 200	(왼쪽 위 모서리 기준)
		setSize(500, 400);			//폭 : 500 , 높이 : 400
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//창 생성
	}
}
