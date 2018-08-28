package oop.test2;

public class Quiz01 {

	public static void main(String[] args) {
		// 월드컵 순위
		WorldCup fra = new WorldCup();
		WorldCup cro = new WorldCup();
		WorldCup bel = new WorldCup();
		WorldCup eng = new WorldCup();
		
		fra.grade = 1;
		fra.nation = "프랑스";
		fra.region = "유럽";
		fra.name = "그리즈만";
		
		cro.grade = 2;
		cro.nation = "크로아티아";
		cro.region = "유럽";
		cro.name = "모드리치";
		
		bel.grade = 3;
		bel.nation = "벨기에";
		bel.region = "유럽";
		bel.name = "데브라이터";
		
		eng.grade = 4;
		eng.nation = "잉글랜드";
		eng.region = "유럽";
		eng.name = "해리캐인";
		
		System.out.println("순위\t"+"이름\t"+"지역\t"+"대표선수\t");
		System.out.println(fra.grade+"\t"+fra.nation+"\t"+fra.region+"\t"+fra.name);
		System.out.println(cro.grade+"\t"+cro.nation+"\t"+cro.region+"\t"+cro.name);
		System.out.println(bel.grade+"\t"+bel.nation+"\t"+bel.region+"\t"+bel.name);
		System.out.println(eng.grade+"\t"+eng.nation+"\t"+eng.region+"\t"+eng.name);
	}

}
