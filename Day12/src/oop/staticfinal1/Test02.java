package oop.staticfinal1;

public class Test02 {

	// ���
	static final int ���� = 0;
	static final int ���� = 1;
	static final int �� = 2;
	
	public static void main(String[] args) {
		// ���������� ����
		int com = (int)(Math.random()*3);
		
		switch(com) {
		case ����:	// ������ 'Test02.����'������ ���� Ŭ�����̹Ƿ� ������
			System.out.println("����");
			break;
		case ����:
			System.out.println("����");
			break;
		case ��:
			System.out.println("��");
			break;
		}
	}

}
