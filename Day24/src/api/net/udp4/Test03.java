package api.net.udp4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test03 {
	public static void main(String[] args) throws Exception{
		//테스트 전송 코드
		String ip = "localhost";
		InetAddress inet = InetAddress.getByName(ip);
		int port = 50000;
		
		DatagramSocket ds = new DatagramSocket();
		
		String name = "아이유";
		byte[] data = name.getBytes();
		
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		ds.send(dp);//전송
		
		ds.close();
	}
}










