package api.net.tcp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 *	TCP Server class
 *	 - �ʿ��� ���� : ��Ʈ, ��������, ����(Socket)
 *	 - �ʿ��� ��� : ���� + ���� + ���� ���
 */
public class Server extends Thread{
	
	private int port;
	
	private ServerSocket server;
	
	private Socket socket;
	
	public Server(int port) {
		this.port = port;
	}
	
	/**
	 * [1] ���� �غ�
	 * [2] ���� ���
	 * [3] ������ ����(����)
	 * [4] ���� ����
	 */
	public void work() {
		try {
			//[1]
			server = new ServerSocket(port);
			
			//[2]
			socket = server.accept();
			
			//[3] 
			this.setDaemon(true);
			this.start();
			
			//[4]
			this.send();
			
			server.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���� �޼ҵ�(������)
	 *  - ���� ���� ����
	 *  - ���ѷ����� ���� �� ���
	 */
	public void run() {
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String line = in.readLine();
				System.out.println("line = "+line);
			}
			
//			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���� �޼ҵ�
	 *  - ����ڿ��� �Է¹ޱ�
	 *  - ��뿡�� ����
	 */
	public void send() {
		try {
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String input = JOptionPane.showInputDialog("�޽��� �Է�");
				if(input != null) {
					out.println(input);
					out.flush();
				}
			}
			
//			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	�׽�Ʈ ����
	public static void main(String[] args) {
		Server server = new Server(50000);
		server.work();
	}
}


