package api.net.tcp8;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * �������� �����ϴ� Ŭ���̾�Ʈ�� ������ �����ϴ� Ŭ����
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
		//���������� �ݺ��Ͽ� ������� �޼����� ����
		
		try {
			while(true) {
				String text = in.readUTF();
				System.out.println(socket+" : "+text);
				
//				�ڱ� �ڽſ��� ȸ��(����)
//				out.writeUTF(text);
//				out.flush();
				
//				��ü���� �����ϵ��� ����
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











