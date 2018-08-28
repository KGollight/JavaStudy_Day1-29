package api.thread;

public class Account {
	
	//변수 : 돈(20억)
	private int money = 2000000000;
	
	//메소드 : 인출기능(동기화되어 처리되어야 한다.)
	//메소드의 모든 코드가 동기화 처리됨
	public synchronized void withdraw(int amount) {
		
		//this(account)를 기준으로 동기화 블록을 생성
//		synchronized(this) {
			System.out.println(Thread.currentThread()+"가"+amount+"원 인출 시작 --> 잔액 : "+money+"원");
			
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {}
			
			money-=amount;
			
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread()+"가"+amount+"원 인출 완료 --> 잔액 : "+money+"원");
//		}
		
	}
}
