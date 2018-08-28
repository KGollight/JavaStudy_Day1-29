package api.net.tcp4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * 연결(Socket)을 기다리는 존재
 * */
public class Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		연결을 기다리기 위한 준비물
//		 - 서버 생성 도구, 포트
		
//		생성 준비
		int port = 50000;
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버 생성 준비 완료!");
		
//		연결 대기
		Socket socket = server.accept();
		System.out.println("사용자가 접속했습니다."+socket);
		
//		데이터 주고받고... 알아서
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(socket.getInputStream()));
		
		@SuppressWarnings("unchecked")
		List<Integer> list = (List<Integer>) in.readObject();
		
		System.out.println("list = "+list);
		
//		in.close();
		
//		연결 종료
		socket.close();
		server.close();
		System.out.println("서버가 종료되었습니다.");
	}

}
