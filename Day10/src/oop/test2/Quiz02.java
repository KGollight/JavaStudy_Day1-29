package oop.test2;

public class Quiz02 {

	public static void main(String[] args) {
		// 월드컵 순위
		WorldCup fra = new WorldCup();
		WorldCup cro = new WorldCup();
		WorldCup bel = new WorldCup();
		WorldCup eng = new WorldCup();
		
		fra.insert(1, "프랑스", "유럽", "그리즈만");
		cro.insert(2, "크로아티아", "유럽", "모드리치");
		bel.insert(3, "벨기에", "유럽", "데브라이터");
		eng.insert(4, "잉글랜드", "유럽", "해리케인");
		
		// 출력
		System.out.println("순위\t"+"이름\t"+"지역\t"+"대표선수\t");
		fra.print();
		cro.print();
		bel.print();
		eng.print();
	}

}
