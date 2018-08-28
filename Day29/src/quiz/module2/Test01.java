package quiz.module2;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Dialog extends JDialog{
	private JPanel con = new JPanel();
	public Border passborder = BorderFactory.createTitledBorder("비밀번호");
	public Border loginborder = BorderFactory.createTitledBorder("아이디");
	private JTextField loginField;
	private JPasswordField passwordField;
	private JButton ok = new JButton("확인");
	private JButton cancel = new JButton("취소");
	public void display() {
this.getContentPane().setLayout(null);
		
		loginField = new JTextField();
		loginField.setBounds(55, 193, 146, 38);
		this.getContentPane().add(loginField);
		loginField.setColumns(10);
		loginField.setBorder(this.loginborder);
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 193, 124, 38);
		this.getContentPane().add(passwordField);
		passwordField.setBorder(this.passborder);
		
		ok.setBounds(104, 247, 97, 23);
		this.getContentPane().add(ok);
		
		cancel.setBounds(239, 247, 97, 23);
		this.getContentPane().add(cancel);
	}
	public void event() {
		FocusListener logfocus = new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!loginField.hasFocus()) {
				loginField.setText("로그인하세요");}
			}
			@Override
			public void focusGained(FocusEvent e) {
				if(loginField.getText()!=null)loginField.setText("");
			}
		};
		FocusListener pwdfocus = new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!passwordField.hasFocus()) {
				passwordField.setText("패스워드를 입력하세요.");
				System.out.println("포커스 없음(패스)");}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText()!=null)passwordField.setText("");
			}
		};
		loginField.addFocusListener(logfocus);
		passwordField.addFocusListener(pwdfocus);
		WindowListener listener = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int c = JOptionPane.showConfirmDialog(con, "정말 종료하시겠습니까?","확인창",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(c==0) {dispose();}
				
			}
		};
		MouseListener mouse = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(loginField.getText()!=null&&passwordField.getText()!=null)
					JOptionPane.showMessageDialog(con, "로그인 성공!", "확인창", JOptionPane.PLAIN_MESSAGE);
				else JOptionPane.showMessageDialog(con, "로그인 실패!", "확인창", JOptionPane.PLAIN_MESSAGE);
			}
				
			};
		ok.addMouseListener(mouse);
		addWindowListener(listener);
		cancel.addActionListener(e->{
			dispose();
		});
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public Dialog() {
		setTitle("시험");
		setLocation(600, 300);
		setSize(400,400);
		setResizable(false);
		setVisible(true);
		display();
		event();
	}
}
	
public class Test01 extends JFrame{
	public static void main(String[] args) {
		Dialog dialog = new Dialog();
	
	
	}
}

