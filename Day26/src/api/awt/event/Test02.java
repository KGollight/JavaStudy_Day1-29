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
 * Frame�� Ȯ���� Ŭ����
 */
class Window02 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	private TextArea area = new TextArea();
	
	private Panel panel = new Panel();
	private Button open = new Button("����");
	private Button save = new Button("����");
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.setLayout(new BorderLayout());
		this.add(area, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		Font font = new Font("����", Font.PLAIN, 30);
		area.setFont(font);
		
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(save);
		panel.add(open);
	}
	
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void event() {
		ActionListener opener = e->{
			//simple.txt�� ������ �ҷ��ͼ� ȭ�鿡 ���
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
			//simple.txt�� � ���ڿ��� ����
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
			
			Window02.this.setTitle("���� �Ϸ�");
		};
		
		save.addActionListener(saver);
		open.addActionListener(opener);
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window02() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(100, 200);	//x : 100, y : 200	(���� �� �𼭸� ����)
		setSize(500, 400);			//�� : 500 , ���� : 400
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
	}
}

public class Test02 {
	public static void main(String[] args) {
		Window02 a = new Window02();	//â ����
	}
}
