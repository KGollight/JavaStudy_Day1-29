package oop.method7;

public class Nations {
	String name;
	int win;
	int equal;
	int lose;
	int getGoal;
	int loseGoal;
	int wPoint;
	
	Nations(String name, int win, int equal, int lose, int getGoal, int loseGoal){
		this.name = name;
		this.win = win;
		this.equal = equal;
		this.lose = lose;
		this.getGoal = getGoal;
		this.loseGoal = loseGoal;
		this.wPoint = win*3 + equal;
	}
	
	void print() {
		System.out.println("*** Á¤º¸ ***");
		System.out.println("±¹°¡ : "+this.name);
		System.out.println("½Â : "+this.win);
		System.out.println("¹« : "+this.equal);
		System.out.println("ÆÐ : "+this.lose);
		System.out.println("µæÁ¡ : "+this.getGoal);
		System.out.println("½ÇÁ¡ : "+this.loseGoal);
		System.out.println("½ÂÁ¡ : "+this.wPoint);
	}
}
