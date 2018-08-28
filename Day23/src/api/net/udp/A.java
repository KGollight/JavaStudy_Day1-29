package api.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * UDP(User Datagram Protocol)
 *  - 일회성 통신(비연결, 문자와 유사)
 *  - 수신 여부가 불투명하지만 빠르다
 *  - 안정적인 환경이라면 매우 효율적
 *  - 바이트밖에 못보냄
 */
public class A {

	public static void main(String[] args) throws IOException {
//		보내는 쪽
		
//		[1] 받는 쪽 정보를 선언
//		String ip = "127.0.0.1";// - 내 자신의 ip
		String ip = "localhost";// - 내 자신의 ip
		int port = 50000;
		
		InetAddress inet = InetAddress.getByName(ip);
		
//		[2] 전송 도구를 준비 - DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		System.out.println("활 준비 완료!");
		
//		[3] 전송할 데이터를 준비
		String str = "UDP 통신 테스트 중";
		byte[] data = str.getBytes();
		
//		DatagramPacket dp = new DatagramPacket(저장소, 저장소크기, 위치정보, 포트)
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
		System.out.println("화살 준비 완료!");
		
//		[4] 전송
		ds.send(dp);
		System.out.println("쏘세요!");
		
//		[5] 종료
		ds.close();
	}

}
