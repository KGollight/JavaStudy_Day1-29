package loop2;

public class JavaGround {

	public static void main(String[] args) {
		int man = 100;
		int play = 0;
		int hour=0;
		
		while(true) {
			int diceNum1 = (int)(Math.random()*6)+1;
			int diceNum2 = (int)(Math.random()*6)+1;
			play++;
			System.out.println("�ֻ����� �� : "+diceNum1+", "+diceNum2);
			
			if(diceNum1==6 && diceNum2==6) {
				System.out.println("Ż���̴�~!!!");
				break;
			}
			hour+=2;
		}
		System.out.println(play+"ȸ, "+hour+"�ð��� �ɷ� Ż���Ͽ����ϴ�.");
	}

}
