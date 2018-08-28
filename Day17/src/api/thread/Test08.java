package api.thread;

public class Test08 {

	public static void main(String[] args) {
//		a, b, c, d, e라는 이름의 사용자를 만들어 동시에 1억씩 인출
		
//		은행 생성
//		스레드 생성
		Runnable a = ()->{ Account2.withdraw(100000000); };
		Runnable b = ()->{ Account2.withdraw(100000000); };
		Runnable c = ()->{ Account2.withdraw(100000000); };
		Runnable d = ()->{ Account2.withdraw(100000000); };
		Runnable e = ()->{ Account2.withdraw(100000000); };
		
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
