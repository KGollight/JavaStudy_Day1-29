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
	 * 회원가입 메소드
	 * [1] 회원 인스턴스 생성
	 * [2] 서버에 접속
	 * [3] 목적(헤더)를 전송
	 * [4] 회원 인스턴스 전송
	 *	[5] 서버의 처리 결과를 논리 형태로 수신
	 * 
	 * @param name	가입할 이름
	 * @param id		가입할 아이디
	 * @param pw		가입할 비밀번호
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
//			System.out.println("처리 결과 : "+result);
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
//			System.out.println("처리 결과 : "+result);
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
		
	
	public static void main(String[] args) throws UnknownHostException {
		Client client = new Client("localhost", 50000);
		boolean result = client.join("홍길동", "hong", "gildong");
		if(result)
			System.out.println("회원가입 성공");
		else
			System.out.println("이미 사용중인 아이디입니다");
	}
}










