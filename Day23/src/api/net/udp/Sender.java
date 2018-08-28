package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {

	public static void main(String[] args) throws IOException {
		String ip = "192.168.0.2";
		int port = 50000;
		
		InetAddress inet = InetAddress.getByName(ip);
		
		DatagramSocket ds = new DatagramSocket();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<������ ������ �Է��ϼ���");
			String str = s.nextLine();
			byte[] data = str.getBytes();
			
			DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
			
			ds.send(dp);
			System.out.println(data.length+"byte ���� �Ϸ�");
			
			if(str.equals("����")) {
				System.out.println("������ ����");
				break;
			}
		}
		ds.close();
		s.close();
	}

}
