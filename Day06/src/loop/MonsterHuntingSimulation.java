package loop;

public class MonsterHuntingSimulation {

	public static void main(String[] args) {
		int gold = 0;
		int monster = 0;
		
		while (monster<1000) {
			int luck = (int)(Math.random()*100);
			int drop = (int)(Math.random()*1000)+100;
			
			if(luck<3) {
				drop*=100;
				System.out.println("***7***��� ���͸� �����̽��ϴ�!***7***"+drop+"��� ȹ��!");
			}
			else
				System.out.println(drop+"��� ȹ��!");
			gold+=drop;
			monster++;
		}
		System.out.println("�� "+monster+"������ ���͸� �����̽��ϴ�.");
		System.out.println("�� ȹ�� ��� : "+gold);
	}

}
