package array;

public class Quiz02 {

	public static void main(String[] args) {
		// 데이터를 배열에 저장한 뒤 랜덤으로 1개만 추첨하여 출력
		String[] data = new String[] {"자바", "파이썬", "빅데이터", "딥러닝", "Iot"};
		
		int ran = (int)(Math.random()*data.length);
		
		System.out.println("추첨 결과 : "+data[ran]);
	}

}
