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
				System.out.println("***7***Çà¿î ¸ó½ºÅÍ¸¦ ÀâÀ¸¼Ì½À´Ï´Ù!***7***"+drop+"°ñµå È¹µæ!");
			}
			else
				System.out.println(drop+"°ñµå È¹µæ!");
			gold+=drop;
			monster++;
		}
		System.out.println("ÃÑ "+monster+"¸¶¸®ÀÇ ¸ó½ºÅÍ¸¦ ÀâÀ¸¼Ì½À´Ï´Ù.");
		System.out.println("ÃÑ È¹µæ °ñµå : "+gold);
	}

}
