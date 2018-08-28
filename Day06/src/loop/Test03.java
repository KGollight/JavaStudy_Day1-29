package loop;

public class Test03 {

	public static void main(String[] args) {
		int day = 1;
		int min = 30;
		
		while (day<=30) {
			System.out.println(day+"일째, "+min+"분 동안 공부했습니다.");
			day+=1;
			min+=5;
		}
	}

}
