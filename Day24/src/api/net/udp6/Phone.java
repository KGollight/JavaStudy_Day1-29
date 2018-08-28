package api.net.udp6;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Phone extends Thread{
	
	/**
	 * ���� �ð�
	 */
	private Date time;
	
	private InetAddress inet;
	private int port;
	
	public Phone() throws UnknownHostException {
		this.inet = InetAddress.getByName("234.123.234.123");
		this.port = 50000;
		receiveTime();
	}
	
	/**
	 * �ð��� �޴� �޼ҵ�
	 */
	public void receiveTime() {
		try(MulticastSocket ms = new MulticastSocket(port);){
			ms.joinGroup(inet);
			
			byte[] buffer = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
			ms.receive(dp);
			
			String str = new String(dp.getData(), 0, dp.getLength());
			//SimpleDateFormat�� ���� ��� �߿� ���ڿ��� �ð����� ������ ����� ����
			SimpleDateFormat sf = new SimpleDateFormat("y-MM-dd E a h:mm:ss");
			this.time = sf.parse(str);
			
			ms.leaveGroup(inet);
			
			this.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean power = true;
	public void off() {
		this.power = false;
	}
	
	public void display() {
		Format f = new SimpleDateFormat("yyyy-MM-dd E a h:mm:ss");
		System.out.println(f.format(time));
	}
	
	@Override
	public void run() {
		//time�� �̿��Ͽ� 1�ʾ� �ð��� ������Ű�� ������ ����
		while(power) {
			Calendar c = Calendar.getInstance();
			c.setTime(time);
			c.set(Calendar.SECOND, c.get(Calendar.SECOND) + 1);
			this.time = c.getTime();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}











