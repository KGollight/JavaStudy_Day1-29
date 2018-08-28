package test.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *	Swing에서 사용하는 Frame : JFrame 
 */
class WindowLogin extends JDialog{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private static JTextField textField;
	private static JPasswordField passwordField;
	private JPanel con = new JPanel();
//	private JDialog con = new JDialog(this, "로그인 뷰어", true);
	
	private JLabel lblId = new JLabel("ID : ");
	private JLabel lblPw = new JLabel("PW : ");	

	public WindowLogin() {
		this.display();
		this.event();
		this.menu();
		
		this.setTitle("로그인 뷰어");
		
		this.setSize(325, 300);
		//화면 크기와 창 크기를 구한 후 창 중앙에 띄움
		//x,y축 : (화면크기/2) - (창 크기/2)
		Dimension dialogSize = this.getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int xSize = screenSize.width/2 - dialogSize.width/2;
		int ySize = screenSize.height/2 - dialogSize.height/2;
		
		this.setLocation(xSize, ySize);
		
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	/**
	 * 화면 구현 메소드
	 */
	public void display() {
		this.setContentPane(con);//con을 Component 설정 영역으로 등록
		
		//this말고 con에 컴포넌트를 추가
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
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//프로그램 종료 확인
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int c = JOptionPane.showConfirmDialog(
						con, "정말로 종료하시겠습니까?", "프로그램 종료 확인", 
						JOptionPane.CLOSED_OPTION, 
						JOptionPane.WARNING_MESSAGE);
				System.out.println("c = "+c);
				if(c==0) {
					System.exit(0);
				}
			}
		};
		this.addWindowListener(w);
		
		//FocusEvent를 사용하여 도움말 출력
		textField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				textField = new JTextField("id를 입력");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				textField = new JTextField("");
			}
		});
	}
	
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
}

public class LoginViewerTest {
	public static void main(String[] args) {
		WindowLogin window = new WindowLogin();
		
	}
}








