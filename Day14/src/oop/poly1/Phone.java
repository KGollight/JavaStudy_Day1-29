package oop.poly1;

// �޴��� Ŭ����(���� Ŭ����)
// - ���� : ��������
// - �޼ҵ� : �������� ����/����/�ź�
// - ������ : 
public class Phone {
	// private		-> �� ������ ���� �Ұ�(���� ���)
	private String serial;
	
	// protected	-> �ڽ� Ŭ������ �����Ӱ� ������ ����
	protected String number;
	
	// �ʼ���� : ���� ���(������ ������ �� ����)
	
	// ���ñ�� : ī�޶� ���
	public void camera() {
		System.out.println("�⺻ ī�޶� ���");
	}
	
	// �����Ұ� : ������ ���(����� ����Ǹ� �ȵǴ� ���)  - final
	public final void develop() {
		System.out.println("������ ���");
	}

	public void power() {
		// TODO Auto-generated method stub
		
	}
}
