package api.net.tcp4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * ����(Socket)�� ��ٸ��� ����
 * */
public class Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(socket.getInputStream()));
		
		@SuppressWarnings("unchecked")
		List<Integer> list = (List<Integer>) in.readObject();
		
		System.out.println("list = "+list);
		
//		in.close();
		
//		���� ����
		socket.close();
		server.close();
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
