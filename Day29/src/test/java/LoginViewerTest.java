package test.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing���� ����ϴ� Frame : JFrame 
 */
class WindowLogin extends JDialog{
	
//	������Ʈ�� ��ġ�� ������ JPanel�� ����
	private static JTextField textField;
	private static JPasswordField passwordField;
	private JPanel con = new JPanel();
//	private JDialog con = new JDialog(this, "�α��� ���", true);
	
	private JLabel lblId = new JLabel("ID : ");
	private JLabel lblPw = new JLabel("PW : ");	

	public WindowLogin() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("�α��� ���");
		
		this.setSize(325, 300);
		//ȭ�� ũ��� â ũ�⸦ ���� �� â �߾ӿ� ���
		//x,y�� : (ȭ��ũ��/2) - (â ũ��/2)
		Dimension dialogSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int xSize = screenSize.width/2 - dialogSize.width/2;
		int ySize = screenSize.height/2 - dialogSize.height/2;
		
		this.setLocation(xSize, ySize);
		
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * ȭ�� ���� �޼ҵ�
	 */
	public void display() {
		this.setContentPane(con);//con�� Component ���� �������� ���
		
		//this���� con�� ������Ʈ�� �߰�
		con.setLayout(null);
		
		lblId.setBounds(39, 30, 34, 15);
		con.add(lblId);
		
		lblPw.setBounds(39, 86, 34, 15);
		con.add(lblPw);
		
		textField = new JTextField();
		textField.setBounds(120, 27, 116, 21);
		con.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 83, 116, 21);
		con.add(passwordField);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(39, 181, 97, 23);
		con.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(169, 181, 97, 23);
		con.add(btnNewButton_1);
	}
	
	/**
	 * �̺�Ʈ ���� �޼ҵ�
	 */
	public void event() {
		//���α׷� ���� Ȯ��
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int c = JOptionPane.showConfirmDialog(
						con, "������ �����Ͻðڽ��ϱ�?", "���α׷� ���� Ȯ��", 
						JOptionPane.CLOSED_OPTION, 
						JOptionPane.WARNING_MESSAGE);
				System.out.println("c = "+c);
				if(c==0) {
					System.exit(0);
				}
			}
		};
		this.addWindowListener(w);
		
		//FocusEvent�� ����Ͽ� ���� ���
		textField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				textField = new JTextField("id�� �Է�");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				textField = new JTextField("");
			}
		});
	}
	
	/**
	 * �޴� ���� �޼ҵ�
	 */
	public void menu() {
		
	}
}

public class LoginViewerTest {
	public static void main(String[] args) {
		WindowLogin window = new WindowLogin();
		
	}
}








