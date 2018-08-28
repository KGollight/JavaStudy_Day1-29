package api.net.tcp4;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * ����(Socket)�� ��ٸ��� ����
 * */
public class Client {

	public static void main(String[] args) throws IOException {
		
//		���� �غ� : ����� ip, port
		String ip = "localhost"; //127.0.0.1
		InetAddress inet = InetAddress.getByName(ip);
		int port = 50000;
		
//		����(���� ����)
		Socket socket = new Socket(inet, port);
		System.out.println("���� �Ϸ�"+socket);
		
//		������ �ְ�ް�.... �˾Ƽ�
		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(socket.getOutputStream()));
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=1000; i++) {
			list.add(i);
		}
		out.writeObject(list);
		out.flush();
		
//		���� ����
		socket.close();
	}

}
