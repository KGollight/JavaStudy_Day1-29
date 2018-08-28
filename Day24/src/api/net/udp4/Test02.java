package api.net.udp4;

public class Test02 {
	public static void main(String[] args) {
		Server server = new Server(50000);
		server.work();
	}
}
