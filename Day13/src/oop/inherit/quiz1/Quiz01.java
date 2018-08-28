package oop.inherit.quiz1;

public class Quiz01 {

	public static void main(String[] args) {
		GalaxyS9 a = new GalaxyS9(1000000, 3500, "글라도스", "SMemo");
		IphoneX b = new IphoneX(1100000, 3800, "HAL2000", "iTunes");
		G7 c = new G7(950000, 3200, "스카이넷", "비디오포탈");
		
		a.app();
		a.print();
		
		b.app();
		b.print();
		
		c.app();
		c.print();
	}

}
