package api.net.udp4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 서버에 투표 결과를 전송하는 클래스
 * @author HWANG
 */
public class Client {
	//변수 : 서버의 정보
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
		ds.send(dp);//전송
		
		ds.close();
	}
}










