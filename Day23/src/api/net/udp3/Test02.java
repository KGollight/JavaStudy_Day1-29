package api.net.udp3;

import java.net.UnknownHostException;

public class Test02 {

	public static void main(String[] args) throws UnknownHostException {
		UdpManager a = new UdpManager("localhost", 40000, 50000);
	}

}
