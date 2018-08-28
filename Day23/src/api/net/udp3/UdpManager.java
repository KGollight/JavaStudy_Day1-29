package api.net.udp3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class UdpManager extends Thread{
	
	//받기 위한 도구
	private InetAddress inet;
	private int myport, yourport;
	
	private DatagramSocket sendDs;
	private DatagramSocket receiveDs;
	
	public UdpManager(String ip, int myport, int yourport) throws UnknownHostException {
		this.inet = InetAddress.getByName(ip);
		this.myport = myport;
		this.yourport = yourport;
		
		this.setDaemon(true);
		this.start();
		this.send();
	}
	
	@Override
	public void run() {
		this.receive();
	}
	
	public void send() {
		try {
			this.sendDs = new DatagramSocket();
			
			while(true) {
				String text = JOptionPane.showInputDialog("보낼 메세지");
				byte[] data = text.getBytes();
				DatagramPacket dp = new DatagramPacket(data, data.length, inet, yourport);
				this.sendDs.send(dp);
				System.out.println("[전송] "+text);
			}
		}
		catch(Exception e) {
			System.out.println("전송 오류");
		}
	}
	
	public void receive() {
		try {
			this.receiveDs = new DatagramSocket(myport);
			
			while(true) {
				byte[] buffer = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				this.receiveDs.receive(dp);
				String text = new String(dp.getData(), 0, dp.getLength());
				System.out.println("[수신] "+text);
			}
		} catch (Exception e) {
			System.out.println("수신 오류");
		}
	}
	
}

