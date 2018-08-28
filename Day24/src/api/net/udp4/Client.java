package api.net.udp4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ������ ��ǥ ����� �����ϴ� Ŭ����
 * @author HWANG
 */
public class Client {
	//���� : ������ ����
	private InetAddress inet;
	private int port;
	
	public Client(String ip, int port) throws UnknownHostException {
		this.inet = InetAddress.getByName(ip);
		this.port = port;
	}
	
	public void send(String name) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		
		byte[] data = name.getBytes();
		
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		ds.send(dp);//����
		
		ds.close();
	}
}










