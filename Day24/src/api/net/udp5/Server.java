package api.net.udp5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {

//		1초마다 시간 전송
	public static void main(String[] args) throws IOException {
		String ip = "235.235.235.235";
		int port = 35000;
		Date date = new Date();
		
		InetAddress inet = InetAddress.getByName(ip);
		
		MulticastSocket ms = new MulticastSocket(port);
		
		ms.joinGroup(inet);
		
//		전송
		Format f = new SimpleDateFormat("y-MM-dd E aa h:mm:ss");
		
		String time = f.format(date);

		byte[] data = time.getBytes();
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		
		ms.send(dp);
		
//		채널 탈퇴
		ms.leaveGroup(inet);
		ms.close();
		
	}

}
