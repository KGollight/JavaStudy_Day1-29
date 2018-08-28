package loop2;

public class Test02 {

	public static void main(String[] args) {
		// while문을 이용하여 '특정 시점'까지 반복을 구현
		// -> 1~10까지의 랜덤값ㅇ르 추첨하여 7이 나오면 종료
		
		while(true) {
			int a = (int)(Math.random()*10)+1;
			System.out.println("a = "+a);
			
			if(a==7) {
				break;
			}
		}
	}

}
