package api.thread;

public class Account {
	
	//���� : ��(20��)
	private int money = 2000000000;
	
	//�޼ҵ� : ������(����ȭ�Ǿ� ó���Ǿ�� �Ѵ�.)
	//�޼ҵ��� ��� �ڵ尡 ����ȭ ó����
	public synchronized void withdraw(int amount) {
		
		//this(account)�� �������� ����ȭ ����� ����
//		synchronized(this) {
			System.out.println(Thread.currentThread()+"��"+amount+"�� ���� ���� --> �ܾ� : "+money+"��");
			
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {}
			
			money-=amount;
			
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread()+"��"+amount+"�� ���� �Ϸ� --> �ܾ� : "+money+"��");
//		}
		
	}
}
