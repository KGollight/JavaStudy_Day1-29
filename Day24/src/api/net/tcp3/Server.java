package api.net.tcp3;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����(Socket)�� ��ٸ��� ����
 * */
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
		System.out.println("����ڰ� �����߽��ϴ�."+socket);
		
//		������ �ְ�ް�... �˾Ƽ�
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(socket.getInputStream()));
		
		int data = in.readInt();
//		in.close();//���� ����
		System.out.println(data);
		
//		���� ����
		socket.close();
		server.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
