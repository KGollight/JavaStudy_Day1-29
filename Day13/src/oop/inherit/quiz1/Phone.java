package oop.inherit.quiz1;

public class Phone {
	private int price;
	private int battery;
	private String AI;
	
	public String getAI() {
		return AI;
	}
	public void setAI(String aI) {
		AI = aI;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void power() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void camera() {
		System.out.println("카메라 기능입니다.");
	}
	
	public void print() {
		System.out.println("*** 핸드폰 정보 ***");
		System.out.println("가격 : "+price+"원");
		System.out.println("배터리 : "+battery+"mA");
		System.out.println("AI : "+AI);
		this.power();
		this.camera();
		System.out.println();
	}
}
