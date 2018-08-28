package times17.homework.explain;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private InetAddress inet;
	private int port;
	
	public Client(String ip, int port) throws UnknownHostException {
		this.inet = InetAddress.getByName(ip);
		this.port = port;
	}
	
	/**
	 * ȸ������ �޼ҵ�
	 * [1] ȸ�� �ν��Ͻ� ����
	 * [2] ������ ����
	 * [3] ����(���)�� ����
	 * [4] ȸ�� �ν��Ͻ� ����
	 *	[5] ������ ó�� ����� �� ���·� ����
	 * 
	 * @param name	������ �̸�
	 * @param id		������ ���̵�
	 * @param pw		������ ��й�ȣ
	 */
	public boolean join(String name, String id, String pw) {
		//[1]
		Member member = new Member(name, id, pw);
		
		//[2]
		try(Socket socket = new Socket(inet, port);){
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			//[3]
			out.writeInt(Header.JOIN);
			out.flush();
			
			//[4]
			out.writeObject(member);
			out.flush();
			
			//[5]
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			boolean result = in.readBoolean();
//			System.out.println("ó�� ��� : "+result);
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean login(String id, String pw) {
		Member member = new Member();
		member.setId(id);
		member.setPassword(pw);
		
		try(Socket socket = new Socket(inet, port);){
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			//[3]
			out.writeInt(Header.LOGIN);
			out.flush();
			
			//[4]
			out.writeObject(member);
			out.flush();
			
			//[5]
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			boolean result = in.readBoolean();
//			System.out.println("ó�� ��� : "+result);
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
		
	
	public static void main(String[] args) throws UnknownHostException {
		Client client = new Client("localhost", 50000);
		boolean result = client.join("ȫ�浿", "hong", "gildong");
		if(result)
			System.out.println("ȸ������ ����");
		else
			System.out.println("�̹� ������� ���̵��Դϴ�");
	}
}










