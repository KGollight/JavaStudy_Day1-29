package api.awp;

import java.awt.*;
import java.awt.event.*;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window02 extends Frame{
	
	public Window02() {
		// ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ"); 		// â ����
		setLocation(650, 350); 		// x�� : 650, y�� : 350 (���� �� �𼭸� ����)
		setSize(300, 200); 			// �� : 300, ���� : 200
		setResizable(false); 		// â ũ�� ���� ����

		setVisible(true); 			// ȭ�� ǥ��
	}
}

public class Test02 {

	public static void main(String[] args) {
		Window02 a = new Window02();	//â ����
	}

}
