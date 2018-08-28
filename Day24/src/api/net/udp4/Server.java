package api.net.udp4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 서버 클래스
 * - 클라이언트가 전송하는 정보를 받아서 투표
 * - 그 외에 필요한 내용들이 있다면 구현(시간 제한, 사용자에게 목록 전달, ...)
 * @author HWANG
 */
public class Server{
	
	/**
	 * 수신기
	 */
	private Receiver receiver;
	
	/**
	 * 생성자에서 수신기를 초기화
	 * (그 외 필요한 요소들이 있다면 이곳에서 초기화)
	 * @param port 수신 포트값
	 */
	public Server(int port) {
		this.receiver = new Receiver(port);
	}
	
	public void work() {
		this.receiver.start();
	}
	
	/**
	 * 수신 기능을 중첩 클래스로 구현
	 *  - 수신에 필요한 내용들만 모듈화를 할 수 있어 관리가 쉽다
	 * @author HWANG
	 */
	private class Receiver extends Thread{

		/**
		 * 서버의 수신 포트
		 */
		private int port;

		/**
		 * 스레드 죽이기용 flag
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
//			UDP 수신 코드를 이곳에 구현
			try(DatagramSocket ds = new DatagramSocket(port);){
				
//				버퍼 준비
				byte[] buffer = new byte[1024];
				
				while(flag) {
//					수신
					DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
					ds.receive(dp);
					
//					받아서 어떻게 할것인가?
					String text = new String(dp.getData(), 0, dp.getLength());
//					System.out.println("## 수신 완료 ##");
//					System.out.println("텍스트 : "+text);
//					System.out.println("수신길이 : "+dp.getLength());
//					System.out.println("수신자 정보 : "+dp.getAddress()+" / "+dp.getPort());
					
//					FileManager를 이용하여 투표 후 목록 출력
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












