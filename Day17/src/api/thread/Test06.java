package api.thread;

public class Test06 {

	public static void main(String[] args) {
//		Runnable�� �̿��� ������ ����
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				for(int i=1; i<=100; i++) {
//					System.out.println("i = "+i);
//				}
//			}
//		};
		
		Runnable r = ()->{
			for(int i=1; i<=100; i++) {
				System.out.println("i = "+i);
			}
		};
		
//		r.setDaemon(true);
//		r.start();
		
//		Thread�� �Űܼ� ����
		Thread t = new Thread(r);
//		t.setDaemon(true);
		t.start();
	}

}
