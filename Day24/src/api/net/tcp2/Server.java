package api.net.tcp2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *	연결(Socket)을 기다리는 존재 
 * @author HWANG
 */
public class Server {
	public static void main(String[] args) throws IOException {
//		연결을 기다리기 위한 준비물
//		 - 서버 생성 도구, 포트
		
//		생성 준비
		int port = 50000;
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버 생성 준비 완료!");
		
//		연결 대기
		Socket socket = server.accept();
		System.out.println("사용자가 접속했습니다 "+socket);
		
//		데이터 받고
		byte[] buffer = new byte[1024];
		int size = socket.getInputStream().read(buffer);
		System.out.println("수신 완료");
		System.out.println("size = "+size);
		String text = new String(buffer, 0, size);
		System.out.println("text = "+text);
		
//		연결 종료
		socket.close();
		server.close();
		System.out.println("서버가 종료되었습니다");
		
	}
}








