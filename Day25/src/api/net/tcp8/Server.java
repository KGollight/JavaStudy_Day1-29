package api.net.tcp8;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * �ǽð����� ���� ���� Socket�� ó���ϴ� TCP ���� 
 * (����� 1���� �����ϸ� �غ��ؾ� �ϴ� ������)
 *  - Socket / InputStream / OutputStream
 */
public class Server {
	
	/**
	 * Ŭ���̾�Ʈ ���
	 */
	private List<Client> list = new ArrayList<>();
	
	private int port;
	
	private ServerSocket server;
	
	public Server(int port) throws IOException {
		this.port = port;
		this.server = new ServerSocket(port);
	}
	
	/**
	 * ���ѹݺ��� �����ϸ� ����ڰ� �����ϸ� list�� �߰�
	 * @throws IOException 
	 */
	public void work() throws IOException {
		while(true) {
//			[1] ������ �����Ѵ�
			Socket socket = server.accept();
			
//			[2] Ŭ���̾�Ʈ �ν��Ͻ� ����
			Client client = new Client(this, socket);	
			client.setDaemon(true);
			client.start();
			
//			[3] ��Ͽ� Ŭ���̾�Ʈ ������ ���
			list.add(client);									
			
//			System.out.println(list.size());
//			System.out.println(list);
		}
	}
	
	/**
	 * ��ü���� �޽����� �����ϴ� ���
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












