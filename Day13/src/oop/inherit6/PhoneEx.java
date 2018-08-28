package oop.inherit6;

public class PhoneEx extends Phone {
	int period;
	String card;
	
	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		switch(period) {
		case 24:	case 30:
		case 36:
			this.period = period;
		}
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public PhoneEx(String name, String telecom, int price, int period, String card) {
		super(name, telecom, price);
		this.setPeriod(period);
		this.setCard(card);
	}
	
	// print()가 정상 작동하지 않으므로 고쳐주겠다
	// 메소드 재정의(method override)
	public void print() {
//		System.out.println("## 휴대폰 정보 ##");
//		System.out.println("이름 : "+getName());
//		System.out.println("통신사 : "+getTelecom());
//		System.out.println("가격 : "+getPrice());
		super.print();
		System.out.println("약정기간 : "+period+"개월");
		System.out.println("제휴카드 : "+card);
	}
}
