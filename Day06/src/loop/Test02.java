package loop;

public class Test02 {

	public static void main(String[] args) {
		// 10번 반복하는 반복문 만들기
		// -> 변수를 만들고, 변수의 값을 변화시키면서 반복 횟수를 결정
		
		int n = 0;
		
		while (n<10) {
			System.out.println("Hello Java!");
			
			n+=1;
		}
		System.out.println("반복 종료!");
	}

}
