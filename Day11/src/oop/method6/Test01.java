package oop.method6;

public class Test01 {

	public static void main(String[] args) {
		Student a = new Student();
		a.name = "호날두";
		a.score = 95;
		
		Student b = new Student();
		b.name = "메시";
		b.score = 92;
		
		Utility util = new Utility();
		int t = util.sum(a, b);
		System.out.println(a.score+" + "+b.score+" = "+t);
	}

}
