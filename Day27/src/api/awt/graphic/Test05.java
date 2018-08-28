package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Frame을 확장한 클래스
 */
class Window05 extends Frame{
	
	/**
	 * 필요한 인스턴스는 멤버 변수로 구현
	 */
	
	private class CanvasEx extends Canvas{
		private int x = 10, y = 10, width = 250, height = 250;
		private Image img;
		
		@Override
		public void paint(Graphics g) {
			if(img!=null)
				g.drawImage(img, x, y, width, height, this);
		}
	}
	
	//인스턴스
	private CanvasEx can = new CanvasEx();
	
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
	
	public Window05() {
		display();
		event();
		menu();
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setTitle("GUI 테스트");
		setLocation(500, 200);	//x : 500, y : 200	(왼쪽 위 모서리 기준)
		setSize(600, 500);			//폭 : 600 , 높이 : 500
		setResizable(false);		//크기 변경 불가
		
		setVisible(true);				//화면 표시
		
		moving();
	}
	
	public void moving() {
		try {
			//[1] 이미지를 불러온다.(run.png)
			// -> BufferedImage 형태로 불러와야 편집이 가능하다.
			BufferedImage buf = ImageIO.read(new File("image/run.png"));
			
			//[2] 이미지를 잘라서 배열형태로 보관한다.
			int w = buf.getWidth()/9;
			int h = buf.getHeight();
			BufferedImage[] arr = new BufferedImage[9];
			for(int i=0; i<arr.length; i++) {
				arr[i] = buf.getSubimage(i*w, 0, w, h);
			}
			
			//[3] 일정시간 간격으로 이미지를 순차적으로 바꿔가면서 다시 그리도록 요청해라.
			int index = 0;
			while(true) {
				can.img = arr[index%9];
				can.repaint();
				
				index++;
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Test05 {
	public static void main(String[] args) {
		Window05 a = new Window05();	//창 생성
	}
}
