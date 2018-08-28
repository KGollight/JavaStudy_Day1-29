package oop.inherit.quiz1;

public class G7 extends Phone {
	
	G7(int price, int battery, String aI, String app){
		this.setPrice(price);
		this.setBattery(battery);
		this.setAI(aI);
	}
	
	public void app() {
		System.out.println("ºñµð¿ÀÆ÷ÅÐ");
	}
}
