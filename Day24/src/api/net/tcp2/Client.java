package api.net.tcp2;

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
		byte[] data = new byte[] {104, 101, 108, 108, 111};
		socket.getOutputStream().write(data);
		
//		���� ����
		socket.close();
	}

}
