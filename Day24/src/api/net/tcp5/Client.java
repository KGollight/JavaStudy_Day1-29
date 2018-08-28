package api.net.tcp5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *	연결(Socket)을 시도하는 존재 
 */
public class Client {
	public static void main(String[] args) throws IOException {
		
//		접속 준비 : 대상의 ip, port
		String ip = "localhost";//127.0.0.1
		InetAddress inet = InetAddress.getByName(ip);
		int port = 50000;
		
//		접속(소켓 생성)
		Socket socket = new Socket(inet, port);
		System.out.println("접속 완료 "+socket);

//		데이터 주고
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream())));

		out.println("문자열 테스트");
		out.flush();
		
//		연결 종료
//		out.close();
		socket.close();
	}
}
















