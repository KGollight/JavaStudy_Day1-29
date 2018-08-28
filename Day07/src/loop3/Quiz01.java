package loop3;

public class Quiz01 {

	public static void main(String[] args) {
		// 1부터 100까지의 정수
		for(int num=1; num<=100; num++) {
			System.out.println("num = "+num);
		}
		// 1부터 100까지의 홀수
		for(int sol=1; sol<=100; sol+=2) {
			System.out.println("sol = "+sol);
		}
		// 알파벳 대문자
		for(char s = 'A'; s<='Z'; s++) {
			System.out.println("알파벳 대문자 : "+s);
		}
		// 1000미만의 2의 제곱수
		for(int mul = 1; mul<1000; mul*=2) {
			System.out.println("2의 제곱수 : "+mul);
		}
		// 10부터 카운트다운
		for(int count=10; count>=0; count--) {
			System.out.println("카운트다운 : "+count);
		}
		
		/* 주의 사항
		 * [1] 반복수는 자료형과 무관
		 * [2] 증감부 설정은 자유
		 * [3] 실수는 반복수로 적합하지 않다.(정확도가 떨어짐)
		 * */
		for(double i = 0.01; i<=1; i+=0.01) {
			System.out.println(i);
		}
	}

}
