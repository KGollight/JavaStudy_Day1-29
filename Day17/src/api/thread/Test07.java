package api.thread;

public class Test07 {

	public static void main(String[] args) {
//		a, b, c, d, e��� �̸��� ����ڸ� ����� ���ÿ� 1�﾿ ����
		
//		���� ����
		Account account = new Account();
		
//		������ ����
		Runnable a = ()->{ account.withdraw(100000000); };
		Runnable b = ()->{ account.withdraw(100000000); };
		Runnable c = ()->{ account.withdraw(100000000); };
		Runnable d = ()->{ account.withdraw(100000000); };
		Runnable e = ()->{ account.withdraw(100000000); };
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(d);
		Thread t5 = new Thread(e);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
