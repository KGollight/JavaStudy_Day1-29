package api.net.tcp5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *	����(Socket)�� �õ��ϴ� ���� 
 */
public class Client {
	public static void main(String[] args) throws IOException {
		
//		���� �غ� : ����� ip, port
		String ip = "localhost";//127.0.0.1
		InetAddress inet = InetAddress.getByName(ip);
		int port = 50000;
		
//		����(���� ����)
		Socket socket = new Socket(inet, port);
		System.out.println("���� �Ϸ� "+socket);

//		������ �ְ�
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream())));

		out.println("���ڿ� �׽�Ʈ");
		out.flush();
		
//		���� ����
//		out.close();
		socket.close();
	}
}
















