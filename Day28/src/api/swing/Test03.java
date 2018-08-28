package api.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window03 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
	private JButton bt1 = new JButton("LineBorder");
	private JButton bt2 = new JButton("TitleBorder");
	private JButton bt3 = new JButton("EmptyBorder");
	private JButton bt4 = new JButton("CompoundBorder");

	public Window03() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("Swing ����");
//		this.setLocation(100, 100);
		this.setLocationByPlatform(true);//��ġ�� �ü���� ��Ģ�� ����
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		this.setContentPane(con);//con�� Component ���� �������� ���
		
		//this���� con�� ������Ʈ�� �߰�
		con.setLayout(new GridLayout(2, 2));
		con.add(bt1);
		con.add(bt2);
		con.add(bt3);
		con.add(bt4);
		
//		LineBorder	������ �� �׵θ�
//		Border b1 = new LineBorder(Color.red, 2, true);
		Border b1 = BorderFactory.createLineBorder(Color.red, 2, true);
		bt1.setBorder(b1);
		
//		Border b2 = BorderFactory.createTitledBorder("����");
		Border b2 = BorderFactory.createTitledBorder(b1, "����");
		bt2.setBorder(b2);
		
		Border b3 = BorderFactory.createEmptyBorder(20, 20, 20, 20);
		bt3.setBorder(b3);
		
		Border b4 = BorderFactory.createCompoundBorder(b3, b1);
		bt4.setBorder(b4);
	}
	
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		// -> Swing������ �ɼ��� ���� �����ϵ��� ����
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x������ â ����
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//����� ���� ����
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
	
}

public class Test03 {
	public static void main(String[] args) {
		Window03 window = new Window03();
	}
}








