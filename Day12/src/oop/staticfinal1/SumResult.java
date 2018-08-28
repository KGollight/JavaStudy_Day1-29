package oop.staticfinal1;

public class SumResult {
	// 1부터 100까지의 합계
	//  -> 계산식이 필요하지만 사용할 수 없다
	//  -> 전용 특수구문을 이용하여 처리
	// public static final int to100=5050;
	public static final int to100;
	static {	// static 전용 초기화 구문
		int total=0;
		for(int i=1; i<=100; i++) {
			total+=i;
		}
		to100 = total;
	}
	
	// 1부터 1000까지의 합계
	public static final int to1000;
	static {
		int total=0;
		for(int i=1; i<=1000; i++) {
			total+=i;
		}
		to1000 = total;
	}
	
	// 1부터 10000까지의 합계
	public static final int to10000;
	static {
		int total=0;
		for(int i=1; i<=10000; i++) {
			total+=i;
		}
		to10000 = total;
	}
}
