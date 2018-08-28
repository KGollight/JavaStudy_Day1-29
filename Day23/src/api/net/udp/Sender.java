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
			System.out.println("<전송할 내용을 입력하세요");
			String str = s.nextLine();
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
		s.close();
	}

}
