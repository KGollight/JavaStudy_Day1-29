package api.net.udp5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Phone {

	public static void main(String[] args) throws IOException {
//		���� �� ���� �ð��� �޾� ����
		String ip = "235.235.235.235";
		int port = 35000;

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
		System.out.println("�ð� : "+text);
		
//		ä�� Ż��
		ms.leaveGroup(inet);
		ms.close();
	}

}
