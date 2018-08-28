package api.net.tcp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 *	TCP Server class
 *	 - 필요한 변수 : 포트, 생성도구, 연결(Socket)
 *	 - 필요한 기능 : 연결 + 전송 + 수신 기능
 */
public class Server extends Thread{
	
	private int port;
	
	private ServerSocket server;
	
	private Socket socket;
	
	public Server(int port) {
		this.port = port;
	}
	
	/**
	 * [1] 서버 준비
	 * [2] 연결 대기
	 * [3] 스레드 생성(수신)
	 * [4] 전송 실행
	 */
	public void work() {
		try {
			//[1]
			server = new ServerSocket(port);
			
			//[2]
			socket = server.accept();
			
			//[3] 
			this.setDaemon(true);
			this.start();
			
			//[4]
			this.send();
			
			server.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 수신 메소드(스레드)
	 *  - 수신 도구 생성
	 *  - 무한루프로 수신 후 출력
	 */
	public void run() {
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String line = in.readLine();
				System.out.println("line = "+line);
			}
			
//			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 전송 메소드
	 *  - 사용자에게 입력받기
	 *  - 상대에게 전송
	 */
	public void send() {
		try {
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String input = JOptionPane.showInputDialog("메시지 입력");
				if(input != null) {
					out.println(input);
					out.flush();
				}
			}
			
//			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	테스트 메인
	public static void main(String[] args) {
		Server server = new Server(50000);
		server.work();
	}
}


