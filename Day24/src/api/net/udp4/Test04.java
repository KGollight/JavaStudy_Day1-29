package api.net.udp4;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("투표할 이름 입력");
		String name = s.nextLine();
		s.close();
		
		Client client = new Client("localhost", 50000);
		client.send(name);
	}
}










