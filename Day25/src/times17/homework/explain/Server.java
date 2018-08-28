package times17.homework.explain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP ȸ������ ����
 *	 - ����ڰ� ������ ������ �޾Ƽ� ������ִ� ����
 *	 - ������ ������ ������ 1ȸ������ ����� ������ ���� 
 *		(������� �� �����͹ް� �� �����ϰ� �� ����˸� �� ��������)
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
				socket = server.accept();//���� ����
				
//				����ڰ� �Ϸ��� �ൿ�� ���� ���°��� ���� �����ϰ� �� �Ŀ� �ش� �۾����� ����
//				 - ������ ������ �߿��� ���ϴ� ���¸� ����(int)
				in = new ObjectInputStream(socket.getInputStream());
				out = new ObjectOutputStream(socket.getOutputStream());
						
				int type = in.readInt();
				
				if(type == Header.JOIN) {
					join();
				}
				else if(type == Header.LOGIN) {
					login();
				}
				
				//���� ����
				socket.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void login() throws IOException, ClassNotFoundException {
//		���� �ޱ�
		Member member = (Member) in.readObject();
//		System.out.println("���� : " + member);
		
//		���� ������ FileManager�� ����
		boolean result = manager.login(member);
		
//		��� ����
		out.writeBoolean(result);
		out.flush();
	}
	
	public void join() throws IOException, ClassNotFoundException {
//		���� �ޱ�
		Member member = (Member) in.readObject();
//		System.out.println("���� : " + member);
		
//		���� ���� - ������ Ŭ������ ����(DataManager)
		boolean result = manager.join(member);
		
//		��� ����
		out.writeBoolean(result);
		out.flush();
	}
	
	public static void main(String[] args) {
		Server server = new Server(50000);
		server.work();
	}
}








