package api.net.tcp2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *	����(Socket)�� ��ٸ��� ���� 
 * @author HWANG
 */
public class Server {
	public static void main(String[] args) throws IOException {
//		������ ��ٸ��� ���� �غ�
//		 - ���� ���� ����, ��Ʈ
		
//		���� �غ�
		int port = 50000;
		ServerSocket server = new ServerSocket(port);
		System.out.println("���� ���� �غ� �Ϸ�!");
		
//		���� ���
		Socket socket = server.accept();
		System.out.println("����ڰ� �����߽��ϴ� "+socket);
		
//		������ �ް�
		byte[] buffer = new byte[1024];
		int size = socket.getInputStream().read(buffer);
		System.out.println("���� �Ϸ�");
		System.out.println("size = "+size);
		String text = new String(buffer, 0, size);
		System.out.println("text = "+text);
		
//		���� ����
		socket.close();
		server.close();
		System.out.println("������ ����Ǿ����ϴ�");
		
	}
}








