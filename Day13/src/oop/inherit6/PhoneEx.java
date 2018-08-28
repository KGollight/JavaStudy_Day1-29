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
	
	// print()�� ���� �۵����� �����Ƿ� �����ְڴ�
	// �޼ҵ� ������(method override)
	public void print() {
//		System.out.println("## �޴��� ���� ##");
//		System.out.println("�̸� : "+getName());
//		System.out.println("��Ż� : "+getTelecom());
//		System.out.println("���� : "+getPrice());
		super.print();
		System.out.println("�����Ⱓ : "+period+"����");
		System.out.println("����ī�� : "+card);
	}
}
