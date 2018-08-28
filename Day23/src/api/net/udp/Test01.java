package api.net.udp;

public class Test01 {

	public static void main(String[] args) {
		String ip = "localhost";
		int port = 50000;
		
		Messenger ms = new Messenger(ip, port);
	}

}
