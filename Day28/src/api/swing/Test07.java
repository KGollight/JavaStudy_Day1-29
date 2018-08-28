package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class Window07 extends JFrame{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private JPanel con = new JPanel();
	
//	�Է�â
	private JTextField tf = new JTextField();
	private JPasswordField pf = new JPasswordField();
	private JCheckBox cb = new JCheckBox("�����մϴ�");
	private JRadioButton r1 = new JRadioButton("����");
	private JRadioButton r2 = new JRadioButton("�̼�����");

	public Window07() {
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
		con.setLayout(new GridLayout(5, 1));
		con.add(tf);
		con.add(pf);
		con.add(cb);
		con.add(r1);
		con.add(r2);
		
//		��ư �׷��� ���� r1, r2�� �׷����� �˷��ش�
		r1.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
	}
	
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//awt������ WindowEvent�� ���� �����ؼ� x��ư�� ó��
		// -> Swing������ �ɼ��� ���� �����ϵ��� ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//x������ ���α׷� ����
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//x������ â �Ҹ�
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		//x������ â ����
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//����� ���� ����
		
		cb.addItemListener(e->{
			System.out.println(e);
			System.out.println(e.getStateChange());
			System.out.println(e.getItem());
//			if(e.getStateChange()==ItemEvent.SELECTED) {
			if(cb.isSelected()) {
				System.out.println("üũ��? üũ��");
			}
			else {
				System.out.println("üũ��... ����.....");
			}
		});
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
	
}

public class Test07 {
	public static void main(String[] args) {
//		��Ų ��ġ : â�� ������ ���� ����
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Window07 window = new Window07();
	}
}








