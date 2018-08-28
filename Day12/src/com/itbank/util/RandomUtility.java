package com.itbank.util;

/**
 * 이 클래스는 랜덤값을 만드는 기능을 가진 클래스입니다
 * 
 * @author 누구게
 *
 */
public class RandomUtility {
	
	/**
	 * 원하는 범위의 랜덤값을 반환하는 메소드
	 * @param start : 범위의 시작
	 * @param finish : 범위의 끝
	 * @return => 해당 범위의 랜덤한 정수값
	 */
	public static int random(int start, int finish) {
		int range=finish-start+1;
		return(int)(Math.random()*range)+start;
	}
}
