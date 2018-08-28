package api.net.udp4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ���� Ŭ����
 * - Ŭ���̾�Ʈ�� �����ϴ� ������ �޾Ƽ� ��ǥ
 * - �� �ܿ� �ʿ��� ������� �ִٸ� ����(�ð� ����, ����ڿ��� ��� ����, ...)
 * @author HWANG
 */
public class Server{
	
	/**
	 * ���ű�
	 */
	private Receiver receiver;
	
	/**
	 * �����ڿ��� ���ű⸦ �ʱ�ȭ
	 * (�� �� �ʿ��� ��ҵ��� �ִٸ� �̰����� �ʱ�ȭ)
	 * @param port ���� ��Ʈ��
	 */
	public Server(int port) {
		this.receiver = new Receiver(port);
	}
	
	public void work() {
		this.receiver.start();
	}
	
	/**
	 * ���� ����� ��ø Ŭ������ ����
	 *  - ���ſ� �ʿ��� ����鸸 ���ȭ�� �� �� �־� ������ ����
	 * @author HWANG
	 */
	private class Receiver extends Thread{

		/**
		 * ������ ���� ��Ʈ
		 */
		private int port;

		/**
		 * ������ ���̱�� flag
		 */
		private boolean flag;
		
		private FileManager manager;
		
		public Receiver(int port) {
			this.port = port;
			this.flag = true;
			this.manager = new FileManager();
		}
		
		
		@Override
		public void run() {
//			UDP ���� �ڵ带 �̰��� ����
			try(DatagramSocket ds = new DatagramSocket(port);){
				
//				���� �غ�
				byte[] buffer = new byte[1024];
				
				while(flag) {
//					����
					DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
					ds.receive(dp);
					
//					�޾Ƽ� ��� �Ұ��ΰ�?
					String text = new String(dp.getData(), 0, dp.getLength());
//					System.out.println("## ���� �Ϸ� ##");
//					System.out.println("�ؽ�Ʈ : "+text);
//					System.out.println("���ű��� : "+dp.getLength());
//					System.out.println("������ ���� : "+dp.getAddress()+" / "+dp.getPort());
					
//					FileManager�� �̿��Ͽ� ��ǥ �� ��� ���
					manager.vote(text);
					manager.list();
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}












