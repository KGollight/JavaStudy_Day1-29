package times17.homework.explain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 회원가입 서버
 *	 - 사용자가 정보를 보내면 받아서 등록해주는 서버
 *	 - 연결을 유지할 것인지 1회성으로 사용할 것인지 결정 
 *		(연결수신 → 데이터받고 → 저장하고 → 결과알림 → 연결종료)
 * @author HWANG
 */
public class Server {
	
	private int port;
	
	private ServerSocket server;
	
	private Socket socket;
	
	public Server(int port) {
		this.port = port;
	}
	
	private FileManager manager = new FileManager();
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
	public void work() {
		try {
			server = new ServerSocket(port);
			
			while(true) {
				socket = server.accept();//연결 수립
				
//				사용자가 하려는 행동에 대한 상태값을 먼저 수신하고 그 후에 해당 작업으로 연계
//				 - 원시형 데이터 중에서 원하는 형태를 선택(int)
				in = new ObjectInputStream(socket.getInputStream());
				out = new ObjectOutputStream(socket.getOutputStream());
						
				int type = in.readInt();
				
				if(type == Header.JOIN) {
					join();
				}
				else if(type == Header.LOGIN) {
					login();
				}
				
				//연결 종료
				socket.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void login() throws IOException, ClassNotFoundException {
//		정보 받기
		Member member = (Member) in.readObject();
//		System.out.println("수신 : " + member);
		
//		정보 유무를 FileManager로 판정
		boolean result = manager.login(member);
		
//		결과 전송
		out.writeBoolean(result);
		out.flush();
	}
	
	public void join() throws IOException, ClassNotFoundException {
//		정보 받기
		Member member = (Member) in.readObject();
//		System.out.println("수신 : " + member);
		
//		파일 저장 - 별도의 클래스로 진행(DataManager)
		boolean result = manager.join(member);
		
//		결과 전송
		out.writeBoolean(result);
		out.flush();
	}
	
	public static void main(String[] args) {
		Server server = new Server(50000);
		server.work();
	}
}








