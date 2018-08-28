package api.util.collection2;

public class RentCar {
	private String name;
	private String allow;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAllow() {
		return allow;
	}
	public void setAllow(String allow) {
		this.allow = allow;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public RentCar() {
		super();
	}
	
	public RentCar(String name, String allow, int price) {
		super();
		this.name = name;
		this.allow = allow;
		this.price = price;
	}
	
	public void print() {
		System.out.println(name+", "+allow+", "+price+"¸¸¿ø");
	}
}
