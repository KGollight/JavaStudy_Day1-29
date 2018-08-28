package array;

public class Test03 {

	public static void main(String[] args) {
		// 랜덤으로 로또번호 추첨
		// 1~45까지 6개, 중복은 신경쓸 필요 없음
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print("<"+lotto[i]+">");
		}
	}

}
