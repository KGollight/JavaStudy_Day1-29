package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * UDP(User Datagram Protocol)
 *  - ��ȸ�� ���(�񿬰�, ���ڿ� ����)
 *  - ���� ���ΰ� ������������ ������
 *  - �������� ȯ���̶�� �ſ� ȿ����
 *  - ����Ʈ�ۿ� ������
 */
public class A {

	public static void main(String[] args) throws IOException {
//		������ ��
		
//		[1] �޴� �� ������ ����
//		String ip = "127.0.0.1";// - �� �ڽ��� ip
		String ip = "localhost";// - �� �ڽ��� ip
		int port = 50000;
		
		InetAddress inet = InetAddress.getByName(ip);
		
//		[2] ���� ������ �غ� - DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Ȱ �غ� �Ϸ�!");
		
//		[3] ������ �����͸� �غ�
		String str = "UDP ��� �׽�Ʈ ��";
		byte[] data = str.getBytes();
		
//		DatagramPacket dp = new DatagramPacket(�����, �����ũ��, ��ġ����, ��Ʈ)
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		System.out.println("ȭ�� �غ� �Ϸ�!");
		
//		[4] ����
		ds.send(dp);
		System.out.println("���!");
		
//		[5] ����
		ds.close();
	}

}
