package api.thread;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {
//		�����带 �����Ͽ� ����
//		 -> t.start()	������ t��� �����带 �����ϴ� ����
//		[������]	main�� ������ t�� ������� �ʴ´�
//		[�ذ�å] t�� main�� ���ӵǵ��� ����(daemon)
		
		Thread t = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread());
				
				for(int i=1; i<=100; i++) {
					System.out.println("i = "+i);
					
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
//		t.setName("�޷�");
//		t.setPriority(10);
		t.setDaemon(true);
		t.start();
		
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ���");
		
		System.out.println("���α׷� ����");
	}

}