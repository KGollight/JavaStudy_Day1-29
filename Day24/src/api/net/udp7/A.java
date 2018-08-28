package api.net.udp7;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class A {

	public static void main(String[] args) throws IOException, InterruptedException {
//		전송 담당
		String ip = "192.168.0.255";
		InetAddress inet = InetAddress.getByName(ip);
		
		int port = 50000;
		
		DatagramSocket ds = new DatagramSocket();
		
		for(int i=1; ; i++) {
			String text = "Hello Breadcast!"+i;
			byte[] data = text.getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
			
			ds.send(dp);
			
			Thread.sleep(1000L);
		}
		
//		ds.close();
	}

}
