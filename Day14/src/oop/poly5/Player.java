package oop.poly5;

// �߻� Ŭ����
// - Ư���� ��찡 �ƴϸ� �ν��Ͻ�ȭ �Ǹ� �ȵȴ�
// - ����, �޼ҵ�(�߻�/�Ϲ�), ������, Ŭ����
public class Player {
	protected String id;
	protected String job;
	protected int level;
	
	// public		�ܺο����� ������ �� �ֵ��� ����ϴ� ������
	// protected	�ܺο����� ������ �� ������ �����ϴ� ������
	public Player(String id, String job) {
		this.id=id;
		this.job=job;
	}
	
	public void attack() {
		
	}
}
