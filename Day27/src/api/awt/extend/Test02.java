package api.awt.extend;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame을 확장한 클래스
 */
class Window02 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
//	모든 프로그램에서 공통적으로 필요로 하는 
//	파일열기창 / 색상선택창 등은 미리 만들어진 클래스가 없는가?
	private FileDialog fwindow = 
			new FileDialog(this, "파일 열기입니다", FileDialog.LOAD);
	
	private Button open = new Button("열기");
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(open);
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
		
		open.addActionListener(e->{
			//파일 열기창을 표시
			fwindow.setVisible(true);
			
			//파일 열기창이 닫히고 나서의 작업을 작성
			// - 열기를 눌렀나요? 눌렀다면 무슨 파일인가요?
			String dir = fwindow.getDirectory();
			String name = fwindow.getFile();
			System.out.println("dir = "+dir);
			System.out.println("name = "+name);
			
			if(dir!=null && name!=null) {
				System.out.println("파일 열기 코드를 실행합니다!");
			}
		});
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
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//창 생성
	}
}
