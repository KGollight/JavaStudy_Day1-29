package oop.poly5;

public class Test01 {

	public static void main(String[] args) {
		// Player�� �ν��Ͻ��� ����� ���
		// [1] Ŭ������ ����� ��ӹ��� �� ����
		// [2] �͸���øŬ������ �̿�(1ȸ�� ���)
		
//		Player p = new Player("ȫ�浿", "����");
		Player p = new Player("ȫ�浿", "����") {
			// �ʿ��� �޼ҵ带 ������
			@Override
			public void attack() {
				System.out.println("["+this.id+"] �����մϴ�.");
			}
		};
		
		p.attack();
	}

}
