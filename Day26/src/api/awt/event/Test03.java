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
 * Frame�� Ȯ���� Ŭ����
 */
class Window03 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	
	private Label lb = new Label("", Label.RIGHT);
	
	private Panel panel = new Panel();
	private Button start = new Button("����");
	private Button stop = new Button("����");
	private Button reset = new Button("�ʱ�ȭ");
	
	/**
	 * �ð��� �����ϴ� ����(���� : �и���)
	 */
	private long time = 0L;
	
	private Thread t;
	public void start() {
		
		//���۹�ư ���
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
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		Font font = new Font("����", Font.BOLD, 50);
		lb.setFont(font);
		
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(start);
		panel.add(stop);
		panel.add(reset);
		
		this.reset();
	}
	
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void event() {
		start.addActionListener(e->{
			//�ð��� 10�ʴ� 10�и��ʾ� �������� ȭ�鿡 ���
			start();
		});
		stop.addActionListener(e->{
			//�ð��� �����Ǵ� �۾��� ����
			stop();
		});
		reset.addActionListener(e->{
			reset();
		});
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window03() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(100, 200);	//x : 100, y : 200	(���� �� �𼭸� ����)
		setSize(500, 250);			//�� : 500 , ���� : 250
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test03 {
	public static void main(String[] args) {
		Window03 a = new Window03();	//â ����
	}
}
