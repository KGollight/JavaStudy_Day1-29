package oop.test2;

public class WorldCup {
	// 변수
	int grade;
	String nation;
	String region;
	String name;
	
	// 메소드
	// void 이름(매개변수) { 코드 }
	void print() {
		// this : 자신의 것이라는 의미를 가지는 애매~~~~~~~~~한 단어
		System.out.println(this.grade+"\t"+this.nation+"\t"+this.region+"\t"+this.name);
	}
	
	void insert(int a, String b, String c, String d) {
		this.grade = a;
		this.nation = b;
		this.region = c;
		this.name = d;
	}
}
