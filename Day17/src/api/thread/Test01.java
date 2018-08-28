package api.thread;

public class Test01 {

	public static void main(String[] args) {
//		자바의 모든 프로그램은 스레드를 기반으로 작동한다
//		 -> 자바에서는 Thread라는 클래스와 Runnable이라는 인터페이스로 처리 가능
		
//		이 프로그램의 스레드 정보를 출력
//		Thread[main,5,main]
//		1번째 정보는 스레드의 이름
//		2번째 정보는 스레드의 우선순위(1~10까지 있고, 높을수록 중요함)
//		3번째 정보는 스레드의 만든 대상
		System.out.println(Thread.currentThread());
	}

}
