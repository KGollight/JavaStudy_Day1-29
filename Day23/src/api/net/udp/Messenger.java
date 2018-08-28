package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JOptionPane;

public class Messenger extends Thread {
	private String ip;
	private int port;
	private String text;
	
	
	public Messenger(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	
	public void sender() throws IOException {
		InetAddress inet = InetAddress.getByName(ip);
		
		DatagramSocket ds = new DatagramSocket();
		
		while(true) {
			System.out.println("<전송할 내용을 입력하세요");
			String str = JOptionPane.showInputDialog("메세지를 입력하세요");
			byte[] data = str.getBytes();
			
			DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
			
			ds.send(dp);
			System.out.println(data.length+"byte 전송 완료");
			
			if(str.equals("종료")) {
				System.out.println("전송자 종료");
				break;
			}
		}
		ds.close();
	}
	
	public void receiver() throws IOException {
		DatagramSocket ds = new DatagramSocket(port);
		
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
		while(true) {
			ds.receive(dp);
			byte[] data = dp.getData();
			int len = dp.getLength();
			
			String str = new String(data, 0, len);
			if(str.contains("종료")) {
				System.out.println("답신자 종료");
				break;
			}
			
			System.out.println("메세지 : "+str);
			
		}
		ds.close();
	}
}
