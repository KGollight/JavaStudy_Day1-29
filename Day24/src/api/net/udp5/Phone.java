package api.net.udp5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Phone {

	public static void main(String[] args) throws IOException {
//		생성 시 서버 시간을 받아 설정
		String ip = "235.235.235.235";
		int port = 35000;

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
		System.out.println("시간 : "+text);
		
//		채널 탈퇴
		ms.leaveGroup(inet);
		ms.close();
	}

}
