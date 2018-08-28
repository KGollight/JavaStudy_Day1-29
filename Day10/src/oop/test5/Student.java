package oop.test5;

public class Student {
	// 변수
	String name;
	int score;
	
	// 생성자
	// Student(){}	=> 기본생성자
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	// 메소드
//	void insert(String name, int score) {
//		this.name = name;
//		this.score = score;
//	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
