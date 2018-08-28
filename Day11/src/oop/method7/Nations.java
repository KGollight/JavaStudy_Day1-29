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
		System.out.println("*** ���� ***");
		System.out.println("���� : "+this.name);
		System.out.println("�� : "+this.win);
		System.out.println("�� : "+this.equal);
		System.out.println("�� : "+this.lose);
		System.out.println("���� : "+this.getGoal);
		System.out.println("���� : "+this.loseGoal);
		System.out.println("���� : "+this.wPoint);
	}
}
