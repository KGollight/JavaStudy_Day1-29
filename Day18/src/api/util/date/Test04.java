package api.util.date;

import java.util.Date;

public class Test04 {

	public static void main(String[] args) {
//		시간 계산
		
//		현재 시간을 "밀리초" 단위로 반환
		long time = System.currentTimeMillis();
		System.out.println("time = "+time);
		
		Date d = new Date(time-60000);
		System.out.println(d);
	}

}
