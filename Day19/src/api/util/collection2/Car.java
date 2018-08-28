package api.util.collection2;

public class Car {
	private String name;
	private boolean rent;
	private int price;
	public Car(String name, int price) {
		super();
		this.name = name;
		this.rent = true;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRent() {
		return rent;
	}
	public void setRent(boolean rent) {
		this.rent = rent;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
//	print() ��ſ� toString()�� �������Ͽ� ���
	@Override
	public String toString() {
		return "[�̸�:"+name+",����:"+price+",����:"+rent+"]";
	}
}

