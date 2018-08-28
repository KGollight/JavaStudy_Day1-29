package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class B {

	public static void main(String[] args) throws IOException {
//		�޴� ��
		
//		[1] ��Ʈ�� ����
		int port = 50000;
		
//		[2] ������ġ�� �غ�
		DatagramSocket ds = new DatagramSocket(port);
		System.out.println("�۷��� �غ� �Ϸ�!");
		
//		[3] ���۵Ǿ��� �����͸� ���� �غ� �Ѵ�.(ũ�⸦ �𸣴ϱ� ����� ũ�� ��´�)
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
//		[4] ����
		ds.receive(dp);
		System.out.println("�޾Ҵ�!");
		
//		[5] ���� ���� �м� : ����� �������� ����(IP, Port)
		byte[] data = dp.getData();
		int len = dp.getLength();
		InetAddress addr = dp.getAddress();
		int yourPort = dp.getPort();
		
		String str = new String(data, 0, len);
		System.out.println("�޼��� : "+str);
		System.out.println("������ : "+addr);
		System.out.println("��Ʈ : "+yourPort);
		
		
//		[6] ����
		ds.close();
	}

}
