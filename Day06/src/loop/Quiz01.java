package loop;

public class Quiz01 {

	public static void main(String[] args) {
		// 누적 저금액
		// 첫날 10원, 둘째날부터 전날의 2배
		int day = 1;
		long save = 10;
		long money = 0;
		
		while (day<=30) {
			System.out.println(day+"일째, 저금액은 "+save+"원, 누적 금액은 "+money+"원 입니다.");
			day++;
			save*=2;
			money = money+save;
		}
	}

}
