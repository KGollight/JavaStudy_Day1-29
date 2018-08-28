package oop.inherit.quiz1;

public class GalaxyS9 extends Phone {
	
	GalaxyS9(int price, int battery, String aI, String app){
		this.setPrice(price);
		this.setBattery(battery);
		this.setAI(aI);
	}
	
	public void app() {
		System.out.println("SMemo");
	}
}
