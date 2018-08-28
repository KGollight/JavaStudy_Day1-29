package api.net.udp5;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class B {
	public static void main(String[] args) throws Exception{
//		수신 담당
//		224.0.0.0 부터 239.255.255.255 사이의 아무 ip를 하나 설정하여 생성
		String ip = "234.234.234.234";
		int port = 50000;

		InetAddress inet = InetAddress.getByName(ip);
		
//		DatagramSocket은 1:1 용이므로 MulticastSocket을 사용
		MulticastSocket ms = new MulticastSocket(port);
		
//		채널(방) 참가
		ms.joinGroup(inet);
		
//		수신
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ms.receive(dp);
		
		String text = new String(dp.getData(), 0, dp.getLength());
		System.out.println("text = "+text);
		
//		채널 탈퇴
		ms.leaveGroup(inet);
		ms.close();
	}
}
