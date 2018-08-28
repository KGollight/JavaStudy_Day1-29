package api.net.tcp3;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
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
		BufferedOutputStream buffer = 
				new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);
		
		data.writeInt(10000);
		data.flush();//���۸�
//		data.close();//���� �� ���� ����
		
//		���� ����
		socket.close();
	}

}
