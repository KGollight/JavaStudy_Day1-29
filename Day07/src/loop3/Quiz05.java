package loop3;

public class Quiz05 {

	public static void main(String[] args) {
		/* 피보나치 수열
		 * 1번째와 2번째는 1로 고정
		 * 3번째부턴 앞의 2자리 숫자의 합계로 구성
		 * 20번째 자리의 값을 화면에 출력
		 * */
		int m=1; // 첫번째 자리
		int n=1; // 2번째 자리
		int s=0; // 3번째 자리
		
		for(int i=1; i<=20; i++) {
			if(i<=2) {
				s=1;
			}
			else {
				s=n+m;
				m=n;
				n=s;
			}
		}
		System.out.println("20번째 자리 값 : "+s);
	}

}
