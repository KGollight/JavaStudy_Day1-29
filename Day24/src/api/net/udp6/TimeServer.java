package api.net.udp6;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1초마다 시간을 계산하여 뿌려주는 클래스
 * @author HWANG
 *
 */
public class TimeServer {
	
	private Format f = new SimpleDateFormat("y-MM-dd E a h:mm:ss");
	
	private InetAddress inet;
	private int port;
	
	public TimeServer(String ip, int port) throws UnknownHostException {
		this.inet = InetAddress.getByName(ip);
		this.port = port;
	}
	
	public void work() {
		try(MulticastSocket ms = new MulticastSocket(port);){
			ms.joinGroup(inet);
			
			while(true) {
				Date d = new Date();
				String time = f.format(d);
//				System.out.println("time = "+time);
				byte[] data = time.getBytes();
				DatagramPacket dp = new DatagramPacket(data, data.length, inet, port);
				ms.send(dp);
				
				Thread.sleep(1000L);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//테스트용 메인
	public static void main(String[] args) throws UnknownHostException {
		TimeServer ts = new TimeServer("234.123.234.123", 50000);
		ts.work();
	}
}















