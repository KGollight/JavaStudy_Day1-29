package oop.inner2;

public class Magician {
	private Staff staff;
	
	public Magician() {
		this.staff = new Staff();
		this.staff.name = "���� ������";
	}
	
	// Magician ���� Ŭ����
	private class Staff {
		private String name;
		private int attack;
	}

}
