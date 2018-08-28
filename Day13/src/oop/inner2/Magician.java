package oop.inner2;

public class Magician {
	private Staff staff;
	
	public Magician() {
		this.staff = new Staff();
		this.staff.name = "마법 지팡이";
	}
	
	// Magician 전용 클래스
	private class Staff {
		private String name;
		private int attack;
	}

}
