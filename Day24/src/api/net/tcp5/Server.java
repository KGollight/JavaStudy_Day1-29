package api.net.tcp5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *	����(Socket)�� ��ٸ��� ���� 
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
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		String line = in.readLine();
		System.out.println("line = "+line);
		
//		in.close();
		
//		���� ����
		socket.close();
		server.close();
		System.out.println("������ ����Ǿ����ϴ�");
		
	}
}








