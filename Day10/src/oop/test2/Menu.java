package oop.test2;

public class Menu {
	String name;
	String kind;
	int price;
	boolean event;
	
	void insert(String name, String kind, int price, boolean event) {
		this.name = name;
		
		switch(kind) {
		case "식사": case "음료":
		this.kind = kind;
		}
		
		if(price>=0) {
			this.price = price;
		}
		
		this.event = event;
	}
	
	void print() {
		int discount;
		
		if(this.event)
			discount = this.price*90/100;
		else
			discount = this.price;
		
		System.out.println(this.name+"\t"+this.kind+"\t"+discount+"\t"+this.event);
	}
}
