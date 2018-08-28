package api.net.tcp8;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 실시간으로 여러 개의 Socket을 처리하는 TCP 서버 
 * (사용자 1명이 접속하면 준비해야 하는 데이터)
 *  - Socket / InputStream / OutputStream
 */
public class Server {
	
	/**
	 * 클라이언트 목록
	 */
	private List<Client> list = new ArrayList<>();
	
	private int port;
	
	private ServerSocket server;
	
	public Server(int port) throws IOException {
		this.port = port;
		this.server = new ServerSocket(port);
	}
	
	/**
	 * 무한반복을 수행하며 사용자가 접속하면 list에 추가
	 * @throws IOException 
	 */
	public void work() throws IOException {
		while(true) {
//			[1] 연결을 수락한다
			Socket socket = server.accept();
			
//			[2] 클라이언트 인스턴스 생성
			Client client = new Client(this, socket);	
			client.setDaemon(true);
			client.start();
			
//			[3] 목록에 클라이언트 정보를 등록
			list.add(client);									
			
//			System.out.println(list.size());
//			System.out.println(list);
		}
	}
	
	/**
	 * 전체에게 메시지를 전송하는 기능
	 * @throws IOException 
	 */
	public void broadcast(String text) throws IOException {
		for(Client client : list) {
			client.send(text);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Server server = new Server(50000);
		server.work();
	}
	
}












