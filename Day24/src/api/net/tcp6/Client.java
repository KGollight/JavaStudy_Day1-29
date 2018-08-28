package api.net.tcp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 *	TCP Client class
 *	 - �ʿ��� ���� : ���� ip, ��Ʈ, ��������, ����(Socket)
 *	 - �ʿ��� ��� : ���� + ���� + ���� ���
 */
public class Client extends Thread{
	
	private InetAddress inet;
	private int port;
	
	private Socket socket;
	
	public Client(String ip, int port) throws UnknownHostException {
		this.inet = InetAddress.getByName(ip);
		this.port = port;
	}
	
	/**
	 * [1] ���� �õ�
	 * [2] ������ ����(����)
	 * [3] ���� ����
	 */
	public void work() {
		try {
			//[1]
			socket = new Socket(inet, port);
			
			//[2] 
			this.setDaemon(true);
			this.start();
			
			//[3]
			this.send();
			
			socket.close();
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
					System.out.println("send : "+input);
				}
			}
			
//			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	�׽�Ʈ ����
	public static void main(String[] args) throws UnknownHostException {
		Client client = new Client("localhost", 50000);
		client.work();
	}
}

