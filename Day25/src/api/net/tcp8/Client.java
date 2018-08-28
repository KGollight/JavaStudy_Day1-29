package api.net.tcp8;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 서버에서 관리하는 클라이언트의 정보를 보관하는 클래스
 * @author HWANG
 */
public class Client extends Thread{
	
	private Socket socket;
	
	private ObjectInputStream in;
	
	private ObjectOutputStream out;
	
	private Server server;
	
	public Client(Server server, Socket socket) throws IOException {
		this.server = server;
		this.socket = socket;
		this.out = new ObjectOutputStream(this.socket.getOutputStream());
		this.in = new ObjectInputStream(this.socket.getInputStream());
	}

	@Override
	public String toString() {
		return "Client [socket=" + socket + "]";
	}
	
	@Override
	public void run() {
		//지속적으로 반복하여 사용자의 메세지를 수신
		
		try {
			while(true) {
				String text = in.readUTF();
				System.out.println(socket+" : "+text);
				
//				자기 자신에게 회신(에코)
//				out.writeUTF(text);
//				out.flush();
				
//				전체에게 전송하도록 구현
				server.broadcast(text);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void send(String text) throws IOException {
		out.writeUTF(text);
		out.flush();
	}
}











