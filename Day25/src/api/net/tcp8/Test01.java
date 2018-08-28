package api.net.tcp8;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) throws IOException {
		//서버에 접속하는 샘플 코드
		InetAddress inet = InetAddress.getByName("192.168.0.2");
		int port = 50000;
		
		Socket socket = new Socket(inet, port);
		System.out.println("socket = "+socket);
		
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		
		while(true) {
			String str = JOptionPane.showInputDialog("입력");
			if(str==null) break;
			
			out.writeUTF(str);
			out.flush();
		}
		
		socket.close();
	}

}
