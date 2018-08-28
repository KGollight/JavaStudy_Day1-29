package api.net.udp6;

import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException, InterruptedException {
		Phone a = new Phone();
		a.display();
		
		Thread.sleep(5000L);
		a.display();
	}
}
