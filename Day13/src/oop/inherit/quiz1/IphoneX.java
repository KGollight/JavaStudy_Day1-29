package oop.inherit.quiz1;

public class IphoneX extends Phone {
	
	IphoneX(int price, int battery, String aI, String app){
		this.setPrice(price);
		this.setBattery(battery);
		this.setAI(aI);
	}
	
	public void app() {
		System.out.println("iTunes");
	}
}
