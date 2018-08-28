package api.net.udp7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class B {

	public static void main(String[] args) throws IOException {
//		수신 담당
		int port = 50000;

		DatagramSocket ds = new DatagramSocket(port);
		
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		ds.receive(dp);
		
		String text = new String(dp.getData(), 0, dp.getLength());
		System.out.println("text = "+text);
	}

}
