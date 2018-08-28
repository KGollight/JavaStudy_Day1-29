package api.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 * JLabel을 확장하여 가위바위보 기능을 추가
 */
class RSPLabel extends JLabel{
	public static final int rock = 0;
	public static final int scissor = 1;
	public static final int paper = 2;
	
	private ImageIcon rockImage = new ImageIcon("image/r.png");
	private ImageIcon scissorImage = new ImageIcon("image/s.png");
	private ImageIcon paperImage = new ImageIcon("image/p.png");

	public RSPLabel() {
		super("", JLabel.CENTER);
	}
	
	public int getRSP() {
		Icon icon = this.getIcon();
		if(icon == rockImage) return rock;
		else if(icon == scissorImage) return scissor;
		else if(icon == paperImage) return paper;
		return -1;
	}
	
	/**
	 * 대기 메소드 : 대기중일 때는 Thread를 이용하여 rsp를 번갈아 표시
	 */
	boolean flag;
	Runnable run = ()->{
		while(flag) {
			randomDisplay();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	};
	public void waiting() {
		flag = true;
		Thread t = new Thread(run);
		t.setDaemon(true);
		t.start();
	}
	
	public void stop() {
		flag = false;
	}
	
	public void display(int rsp) {
		switch(rsp) {
		case rock: this.setIcon(rockImage); break;
		case scissor: this.setIcon(scissorImage); break;
		case paper: this.setIcon(paperImage); break;
		}
	}
	
	public void randomDisplay() {
		int n = (int)(Math.random() * 3);
		display(n);
	}
	
}

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class Window08 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JLabel result = new JLabel("", JLabel.CENTER);
	
	private JPanel center = new JPanel();
	private RSPLabel computer = new RSPLabel();
	private RSPLabel user = new RSPLabel();
	
	private JPanel south = new JPanel();
	private JButton rock = new JButton("바위");
	private JButton scissor = new JButton("가위");
	private JButton paper = new JButton("보");
	
	public Window08() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing 예제");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);
		this.setSize(400, 280);
		this.setResizable(false);
		this.setVisible(true);
		
		computer.waiting();
	}
	/**
	 * 화면 구현 메소드
	 */
	public void display() {
		this.setContentPane(con);//con을 Component 설정 영역으로 등록
		
		//this말고 con에 컴포넌트를 추가
		con.setLayout(new BorderLayout());
		con.add(result, BorderLayout.NORTH);
		result.setText("가위바위보 게임");
		result.setFont(new Font("", Font.PLAIN, 25));
		con.add(center, BorderLayout.CENTER);
		con.add(south, BorderLayout.SOUTH);
		
		center.setLayout(new GridLayout(1, 2));
		center.add(computer);
		center.add(user);
		
		Border c = BorderFactory.createLineBorder(Color.black, 3, false);
		computer.setBorder(BorderFactory.createTitledBorder(c, "컴퓨터"));
		user.setBorder(BorderFactory.createTitledBorder(c, "사용자"));
		
		south.setLayout(new GridLayout(1, 3));
		south.add(scissor);
		south.add(rock);
		south.add(paper);
	}
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
//		awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
//		 -> Swing에서는 옵션을 통해 지정하도록 변경
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 프로그램 종료
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x누르면 창 숨김
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		
		rock.addActionListener(e->{
			computer.stop();
			computer.randomDisplay();
			user.display(RSPLabel.rock);
			displayResult();
		});
		
		scissor.addActionListener(e->{
			computer.stop();
			computer.randomDisplay();
			user.display(RSPLabel.scissor);
			displayResult();
		});
		
		paper.addActionListener(e->{
			computer.stop();
			computer.randomDisplay();
			user.display(RSPLabel.paper);
			displayResult();
		});
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
	
	public void displayResult() {
		String text = getResult();
		result.setText(text);
	}
	
	public String getResult() {
		int userRSP = user.getRSP();
		int computerRSP = computer.getRSP();
		switch(userRSP) {
		case RSPLabel.rock:
			if(computerRSP == RSPLabel.rock) return "비겼습니다";
			else if(computerRSP == RSPLabel.scissor) return "사용자가 이겼습니다";
			else if(computerRSP == RSPLabel.paper) return "컴퓨터가 이겼습니다";
		case RSPLabel.scissor:
			if(computerRSP == RSPLabel.rock) return "컴퓨터가 이겼습니다";
			else if(computerRSP == RSPLabel.scissor) return "비겼습니다";
			else if(computerRSP == RSPLabel.paper) return "사용자가 이겼습니다";
		case RSPLabel.paper:
			if(computerRSP == RSPLabel.rock) return "사용자가 이겼습니다";
			else if(computerRSP == RSPLabel.scissor) return "컴퓨터가 이겼습니다";
			else if(computerRSP == RSPLabel.paper) return "비겼습니다";
		}
		return null;
	}
	
}

public class Test08 {
	public static void main(String[] args) {
//		스킨 설치 : 창이 켜지기 전에 수행
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		Window08 window = new Window08();
	}
}









