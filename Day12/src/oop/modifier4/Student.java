package oop.modifier4;

class Student {
	private String name;
	private int score;
	
	Student(){}
	Student(String name, int score){
		//this.name = name;	=> 은닉화를 위해 직접적 접근을 막음
		this.setName(name);
		this.setScore(score);
	}
	// setter 메소드
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		if(score<0 || score>100)
			return;
		else
			this.score = score;
	}
	
	// getter 메소드
	String getName() {
		return /*this.*/ name;
	}
	
	int getScore() {
		return score;
	}
}
