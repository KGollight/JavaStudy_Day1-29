package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

	public static void main(String[] args) throws IOException {
		
		int port = 50000;
		
		DatagramSocket ds = new DatagramSocket(port);
		
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
		while(true) {
			ds.receive(dp);
			byte[] data = dp.getData();
			int len = dp.getLength();
			
			String str = new String(data, 0, len);
			if(str.contains("종료")) {
				System.out.println("답신자 종료");
				break;
			}
			
			System.out.println("메세지 : "+str);
			
		}
		ds.close();
	}

}
