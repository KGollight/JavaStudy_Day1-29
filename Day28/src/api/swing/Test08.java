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
 * JLabel�� Ȯ���Ͽ� ���������� ����� �߰�
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
	 * ��� �޼ҵ� : ������� ���� Thread�� �̿��Ͽ� rsp�� ������ ǥ��
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
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window08 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JLabel result = new JLabel("", JLabel.CENTER);
	
	private JPanel center = new JPanel();
	private RSPLabel computer = new RSPLabel();
	private RSPLabel user = new RSPLabel();
	
	private JPanel south = new JPanel();
	private JButton rock = new JButton("����");
	private JButton scissor = new JButton("����");
	private JButton paper = new JButton("��");
	
	public Window08() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing ����");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);
		this.setSize(400, 280);
		this.setResizable(false);
		this.setVisible(true);
		
		computer.waiting();
	}
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		this.setContentPane(con);//con�� Component ���� �������� ���
		
		//this���� con�� ������Ʈ�� �߰�
		con.setLayout(new BorderLayout());
		con.add(result, BorderLayout.NORTH);
		result.setText("���������� ����");
		result.setFont(new Font("", Font.PLAIN, 25));
		con.add(center, BorderLayout.CENTER);
		con.add(south, BorderLayout.SOUTH);
		
		center.setLayout(new GridLayout(1, 2));
		center.add(computer);
		center.add(user);
		
		Border c = BorderFactory.createLineBorder(Color.black, 3, false);
		computer.setBorder(BorderFactory.createTitledBorder(c, "��ǻ��"));
		user.setBorder(BorderFactory.createTitledBorder(c, "�����"));
		
		south.setLayout(new GridLayout(1, 3));
		south.add(scissor);
		south.add(rock);
		south.add(paper);
	}
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
//		awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
//		 -> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x������ ���α׷� ����
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x������ â ����
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//����� ���� ����
		
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
	 * �޴� ���� �޼ҵ�
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
			if(computerRSP == RSPLabel.rock) return "�����ϴ�";
			else if(computerRSP == RSPLabel.scissor) return "����ڰ� �̰���ϴ�";
			else if(computerRSP == RSPLabel.paper) return "��ǻ�Ͱ� �̰���ϴ�";
		case RSPLabel.scissor:
			if(computerRSP == RSPLabel.rock) return "��ǻ�Ͱ� �̰���ϴ�";
			else if(computerRSP == RSPLabel.scissor) return "�����ϴ�";
			else if(computerRSP == RSPLabel.paper) return "����ڰ� �̰���ϴ�";
		case RSPLabel.paper:
			if(computerRSP == RSPLabel.rock) return "����ڰ� �̰���ϴ�";
			else if(computerRSP == RSPLabel.scissor) return "��ǻ�Ͱ� �̰���ϴ�";
			else if(computerRSP == RSPLabel.paper) return "�����ϴ�";
		}
		return null;
	}
	
}

public class Test08 {
	public static void main(String[] args) {
//		��Ų ��ġ : â�� ������ ���� ����
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		Window08 window = new Window08();
	}
}









