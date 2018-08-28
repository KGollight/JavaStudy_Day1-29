package oop.modifier4;

class Student {
	private String name;
	private int score;
	
	Student(){}
	Student(String name, int score){
		//this.name = name;	=> ����ȭ�� ���� ������ ������ ����
		this.setName(name);
		this.setScore(score);
	}
	// setter �޼ҵ�
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		if(score<0 || score>100)
			return;
		else
			this.score = score;
	}
	
	// getter �޼ҵ�
	String getName() {
		return /*this.*/ name;
	}
	
	int getScore() {
		return score;
	}
}
