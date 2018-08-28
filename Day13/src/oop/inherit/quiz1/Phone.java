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
		System.out.println("������ �������ϴ�.");
	}
	
	public void camera() {
		System.out.println("ī�޶� ����Դϴ�.");
	}
	
	public void print() {
		System.out.println("*** �ڵ��� ���� ***");
		System.out.println("���� : "+price+"��");
		System.out.println("���͸� : "+battery+"mA");
		System.out.println("AI : "+AI);
		this.power();
		this.camera();
		System.out.println();
	}
}
