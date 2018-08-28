package api.net.udp5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {

//		1�ʸ��� �ð� ����
	public static void main(String[] args) throws IOException {
		String ip = "235.235.235.235";
		int port = 35000;
		Date date = new Date();
		
		InetAddress inet = InetAddress.getByName(ip);
		
		MulticastSocket ms = new MulticastSocket(port);
		
		ms.joinGroup(inet);
		
//		����
		Format f = new SimpleDateFormat("y-MM-dd E aa h:mm:ss");
		
		String time = f.format(date);

		byte[] data = time.getBytes();
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		
		ms.send(dp);
		
//		ä�� Ż��
		ms.leaveGroup(inet);
		ms.close();
		
	}

}
