package oop.singleton2;

public class Timer {
	private int hour, minute, second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	private Timer(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// 이곳에서만 인스턴스 생성이 가능
	private static Timer instance = new Timer(0, 0, 0);
	public static Timer getInstance() {
		return instance;
	}
	
	
}
