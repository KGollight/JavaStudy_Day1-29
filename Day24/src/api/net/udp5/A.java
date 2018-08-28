package api.net.udp5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class A {
	public static void main(String[] args) throws IOException {
//		���� ���
		
//		224.0.0.0 ���� 239.255.255.255 ������ �ƹ� ip�� �ϳ� �����Ͽ� ����
		String ip = "234.234.234.234";
		int port = 50000;

		InetAddress inet = InetAddress.getByName(ip);
		
//		DatagramSocket�� 1:1 ���̹Ƿ� MulticastSocket�� ���
		MulticastSocket ms = new MulticastSocket(port);
		
//		ä��(��) ����
		ms.joinGroup(inet);
		
//		����
		String text = "Hello Multicast UDP ���";
		byte[] data = text.getBytes();
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		
		ms.send(dp);
		
//		ä�� Ż��
		ms.leaveGroup(inet);
		ms.close();
		
	}
}
