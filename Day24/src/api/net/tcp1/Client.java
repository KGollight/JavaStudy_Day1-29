package api.net.tcp1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

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
		
//		���� ����
		socket.close();
	}

}
