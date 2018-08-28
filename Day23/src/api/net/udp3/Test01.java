package api.net.udp3;

import java.net.UnknownHostException;

public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		UdpManager a = new UdpManager("localhost", 50000, 40000);
	}

}
