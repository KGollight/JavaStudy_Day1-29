package oop.test5;

public class Student {
	// ����
	String name;
	int score;
	
	// ������
	// Student(){}	=> �⺻������
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	// �޼ҵ�
//	void insert(String name, int score) {
//		this.name = name;
//		this.score = score;
//	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
