package api.net.tcp4;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 연결(Socket)을 기다리는 존재
 * */
public class Client {

	public static void main(String[] args) throws IOException {
		
//		접속 준비 : 대상의 ip, port
		String ip = "localhost"; //127.0.0.1
		InetAddress inet = InetAddress.getByName(ip);
		int port = 50000;
		
//		접속(소켓 생성)
		Socket socket = new Socket(inet, port);
		System.out.println("접속 완료"+socket);
		
//		데이터 주고받고.... 알아서
		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(socket.getOutputStream()));
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=1000; i++) {
			list.add(i);
		}
		out.writeObject(list);
		out.flush();
		
//		연결 종료
		socket.close();
	}

}
