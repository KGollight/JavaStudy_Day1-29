package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class B {

	public static void main(String[] args) throws IOException {
//		받는 쪽
		
//		[1] 포트를 지정
		int port = 50000;
		
//		[2] 수신장치를 준비
		DatagramSocket ds = new DatagramSocket(port);
		System.out.println("글러브 준비 완료!");
		
//		[3] 전송되어진 데이터를 받을 준비를 한다.(크기를 모르니까 충분히 크게 잡는다)
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
//		[4] 수신
		ds.receive(dp);
		System.out.println("받았다!");
		
//		[5] 받은 내용 분석 : 내용과 보낸이의 정보(IP, Port)
		byte[] data = dp.getData();
		int len = dp.getLength();
		InetAddress addr = dp.getAddress();
		int yourPort = dp.getPort();
		
		String str = new String(data, 0, len);
		System.out.println("메세지 : "+str);
		System.out.println("보낸이 : "+addr);
		System.out.println("포트 : "+yourPort);
		
		
//		[6] 종료
		ds.close();
	}

}
