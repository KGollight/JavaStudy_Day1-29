package api.Thread;

import javax.swing.JOptionPane;

public class Test12 {

	public static void main(String[] args) {
		
//		���� ó���� �� TimerŬ������ �̿��Ͽ� �����带 ���� ������Ű�ڴ�.
		Timer t = new Timer();
		t.start();
		
//		�׽�Ʈ�� ���� �˸�â
		JOptionPane.showMessageDialog(null, "�׽�Ʈ");
		t.kill();
	}

}
