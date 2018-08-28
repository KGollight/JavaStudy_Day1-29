package api.net.udp5;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class B {
	public static void main(String[] args) throws Exception{
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
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ms.receive(dp);
		
		String text = new String(dp.getData(), 0, dp.getLength());
		System.out.println("text = "+text);
		
//		ä�� Ż��
		ms.leaveGroup(inet);
		ms.close();
	}
}
