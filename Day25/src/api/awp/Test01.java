package api.awp;

import java.awt.Frame;

public class Test01 {

	public static void main(String[] args) {
		Frame a = new Frame();	//â ����
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		a.setTitle("GUI �׽�Ʈ");		//â ����
		a.setLocation(650, 350);	//x�� : 650, y�� : 350 (���� �� �𼭸� ����)
		a.setSize(300, 200);		//�� : 300, ���� : 200
		a.setResizable(false);		//â ũ�� ���� ����
		
		a.setVisible(true);		//ȭ�� ǥ��
	}

}
