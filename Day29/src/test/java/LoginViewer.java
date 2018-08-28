package test.java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginViewer extends JDialog {

	private static JTextField textField;
	private static JPasswordField passwordField;
	private JPanel con = new JPanel();
	
	private JLabel lblId = new JLabel("ID : ");
	private JLabel lblPw = new JLabel("PW : ");	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginViewer dialog = new LoginViewer();
			dialog.setVisible(true);
			dialog.setRootPaneCheckingEnabled(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginViewer() {
		this.display();
		this.event();
		
		this.setTitle("�α��� ���");
		
		this.setSize(325, 300);
		//ȭ�� ũ��� â ũ�⸦ ���� �� â �߾ӿ� ���
		//x,y�� : (ȭ��ũ��/2) - (â ũ��/2)
		Dimension dialogSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int xSize = screenSize.width/2 - dialogSize.width/2;
		int ySize = screenSize.height/2 - dialogSize.height/2;
		
		this.setLocation(xSize, ySize);
		this.setAlwaysOnTop(true);//�׻� ��
		
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
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{
			JButton okButton = new JButton("Confirm");
			okButton.setBounds(39, 201, 93, 23);
			con.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(166, 201, 73, 23);
			con.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
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
				textField = new JTextField("");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				textField = new JTextField("id�� �Է�");
			}
		});
		
		passwordField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				passwordField = new JPasswordField("");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				passwordField = new JPasswordField("pw�� �Է�");
			}
		});
	}
}
