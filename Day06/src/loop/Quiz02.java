package loop;

public class Quiz02 {

	public static void main(String[] args) {
		// 강화 확률표
		// 성공 : 20% / 실패 : 80%
		// 성공 시 템레벨 1증가, 실패시 유지
		// 0렙 템 50번 강화하면 어떻게?
		int level = 0;
		int times = 1;
		
		while (times<=50) {
			System.out.println(times+"회 시도하셨습니다.");
			
			int inchant = (int)(Math.random()*100);
			
			if(inchant<20) {
				level+=1;
				System.out.println("강화 성공! 현재 아이템 레벨 : "+level);
			}
			else
				System.out.println("강화에 실패하셨습니다.");

			times++;
		}
	}

}
