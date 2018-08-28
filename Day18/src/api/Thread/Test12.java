package api.Thread;

import javax.swing.JOptionPane;

public class Test12 {

	public static void main(String[] args) {
		
//		종료 처리가 된 Timer클래스를 이용하여 스레드를 강제 정지시키겠다.
		Timer t = new Timer();
		t.start();
		
//		테스트를 위한 알림창
		JOptionPane.showMessageDialog(null, "테스트");
		t.kill();
	}

}
