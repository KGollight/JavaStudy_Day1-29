package oop.final1;

public class Subject {
	// final을 붙이면 오류가 발생하는 이유
	//  - 초기화가 이루어지지 않아서...
	//  - 직접 초기화를 하거나, 혹은 "생성자"를 이용
	// final String name = "자바 SW 개발자 양성;
	final String name;
	int people;
	
	Subject(){
		this.name = "test";
	}
	
	Subject(String name){
		this.name = name;
	}
	
	Subject(String name, int people){
		this.name = name;
		this.people = people;
	}
}
